const express = require('express');
const app = express();
const postRouter = require('./routes/post');
const userRouter = require('./routes/user');
const postsRouter = require('./routes/posts');


app.use('/post', postRouter);
app.use('/user', userRouter);
app.use('/posts', postsRouter);

app.get('/', (req, res) => {res.send('Hello'); });

app.listen(3065, () => {console.log('server....');});