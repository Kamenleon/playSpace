#!/bin/bash

usage()
{
	# シェルスクリプトのファイル名を取得
	local script_name=$(basename "$0")
	# ヒアドキュメントでヘルプを表示
	cat << END
USAGE: $script_name PATTERN [PATH] [NAME_PATTERN]
find file in current directory recursively, and print lines which match PATTERN.

	PATH         find file in PATH directory, instead of current directory
	NAME_PATTERN specify name pattern to find file

Examples:
	$script_name return
	$script_name return ~ '*.txt'
END
}

if [ "$#" -eq 0 ]; then
	usage
	exit 1
fi

pattern=$1
directory=$2
name=$3

# 第2引数（起点ディレクトリ）が空文字列ならば、デフォルト値と
# して.（カレントディレクトリ）を設定
if [ -z "$directory" ]; then
	directory='.'
fi

# 第3引数（検索ファイルパターン）が空文字列ならば
# デフォルト値として'*'を設定

if [ -z "$name" ]; then
	name='*'
fi

# 検索ディレクトリが存在しない場合にはエラーメッセージを表示して終了
if [ ! -d "$directory" ]; then
	echo "$0: ${directory}: No such directory" 1>&2
	exit 2
fi

find "$directory" -type f -name "$name" | xargs grep "$pattern" -nH "$pattern"

