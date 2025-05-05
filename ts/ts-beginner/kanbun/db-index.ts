import { Database } from "bun:sqlite";
import { createItem, deleteItem, getItems, archiveItems, updateTodoToDone, initializeItemTable } from "./db";
import { formatToItem } from "./format";

const db = new Database("sqllite.db");

initializeItemTable(db);

if (Bun.argv.length == 4) {
  // コマンドライン引数の最後の3つの文字列を取得する。
  const content: string = Bun.argv.pop() ?? "";
  const command: string = Bun.argv.pop() ?? "";
  
  switch (command) {
    case "memo":
      createItem(db, content, command);
      break;
    case "todo":
      createItem(db, content, command);
      break;
    case "done":
      updateTodoToDone(db, content);
      break
    case "drop":
      deleteItem(db, content);
      break
    default:
      throw new Error("不正なコマンドです");
  }
  console.log("Done add "+ command);
} else if (Bun.argv.length === 3) {
  const command: string = Bun.argv.pop() ?? "";

  switch (command) {
    case "trim":
      archiveItems(db);
      break
    default:
      throw new Error("不正なコマンドです");
  }
} else if (Bun.argv.length === 2) {
  const items = getItems(db);
  items.forEach((item) => {
    console.log(formatToItem(item));
  });
} else {
  throw new Error("コマンドライン引数の数が多すぎます");
}
db.close();

