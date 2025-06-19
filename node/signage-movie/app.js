const express = require('express');
const app = express();
const path = require('path');
const fs = require('fs');

// 静的ファイルの提供
app.use(express.static('public'));

// 動画ファイルの一覧を取得する関数
function getVideoFiles() {
  const videoDir = path.join(__dirname, 'public/videos');
  return fs.readdirSync(videoDir)
    .filter(file => /\.(mp4|webm)$/i.test(file))
    .map(file => `/videos/${file}`);
}

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'index.html'));
});

app.get('/videos', (req, res) => {
  res.json(getVideoFiles());
});

app.listen(3000, () => {
  console.log('動画プレイヤーが起動しました。');
});


