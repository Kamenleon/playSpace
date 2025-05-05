import type { Item, Kind } from "./type";

export function symbolizeKind(kind: Kind): string {
  switch (kind) {
    case "memo":
      return "-";
    case "todo":
      return "○";
    case "done":
      return "×";
  }
}

/** 項目の内容の先頭に、項目の種類に相当するシンボルをつけて返す */
export function formatToItem(item: Item) :string {
  const symbol = symbolizeKind(item.kind);
  return `${symbol} ${item.content}`;
}

