const express = require('express');
const router = express.Router();

router.post('', (req, res) => { res.send('글쓰기')} );

module.exports = router;