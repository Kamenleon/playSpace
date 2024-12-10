#!/bin/bash

list_recursive()
{
	local filepath=$1
	local indent=$2

	# インデントを取り除いて、パス部分を取り除いてファイル名を表示する。
	echo "${indent}${filepath##*/}"

	if [ -d "$filepath" ]; then
		# ディレクトリである場合は、その中に含まれるファイルや
		# ディレクトリを一覧表示する。
		local fname
		for fname in $(ls "$filepath")
		do
			# インデントにスペースを追加して再起呼び出し
			list_recursive "${filepath}/${fname}" "     $indent"
		done
	fi
}

list_recursive "$1" ""
