import { expect, test } from "bun:test";
import { formatToItem } from "./format";

const itemMemo = {
  id: 1,
  content: "メモ",
  kind: "memo",
  archived: false,
} satisfies Item;

const itemTodo = {
  id: 1,
  content: "TODO",
  kind: "todo",
  archived: false,
} satisfies Item;

test("formatToItem", () => {
  expect(formatToItem(itemMemo)).toBe("- メモ");
  expect(formatToItem(itemTodo)).toBe("○ TODO");
});


