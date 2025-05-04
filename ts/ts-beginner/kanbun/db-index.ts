import { Database } from "bun:sqlite";
import { createItem, initializeItemTable } from "./db";

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
      // TODO: タスクを完了する処理を書く
      break
    default:
      throw new Error("不正なコマンドです");
  }

  console.log("Done add "+ command);
  
} else if (Bun.argv.length === 2) {
  // console.log(source);
} else {
  throw new Error("コマンドライン引数の数が多すぎます");
}

db.close();
