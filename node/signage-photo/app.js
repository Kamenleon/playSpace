const express = require('express');
const app = express();
const path = require('path');
const fs = require('fs');

// 静的ファイルの提供
app.use(express.static('public'));

// 画像ファイルの一覧を取得する関数
function getImageFiles() {
  const imageDir = path.join(__dirname, 'public/images');
  return fs.readdirSync(imageDir)
    .filter(file => /\.(jpg|jpeg|png|gif)$/i.test(file))
    .map(file => `images/${file}`);
}

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'index.html'));
});

app.get('/images', (req, res) => {
  res.json(getImageFiles());
})

app.listen(3000, () => {
  console.log('スライドショーサーバーを起動しました');
})

