import React, { useCallback, useEffect } from 'react';
import { Button, Form, Input } from 'antd';
import PropTypes from 'prop-types';
import userInput from '../hooks/userInput';

// 1. ADD_COMMENT_REQUEST
import {ADD_COMMENT_REQUEST} from '../reducers/post';
// 2. useDispatch, useSelector
import { useDispatch, useSelector } from 'react-redux';


const CommentForm = ( { post } ) => {   // 어떤게시글에대한 댓글
  // 3. addCommentLoading, addCommentDone
   const { addCommentLoading, addCommentDone } = useSelector(state => state.post); 
   const id = useSelector(state => state.user.user?.id); 
  // 4. dispatch
  const dispatch = useDispatch();

  ////////////////////////////  code
 
  const [comment, onChangeComment, setComment] = userInput('');

  // 댓글 작성 완료 시 초기화
  useEffect(() => {
    if (addCommentDone) {
      setComment('');
    }
  }, [addCommentDone]);
  
  const onsubmitForm = useCallback(() => {
    dispatch({
      type: ADD_COMMENT_REQUEST,
      data: {
        content: comment,
        userId: id,
        postId: post.id,
      },
    });
  }, [comment, id, post.id, dispatch]);

  
  ////////////////////////////  view
  return (
    <Form onFinish={onsubmitForm} style={{margin:50, position:'relative'}}>
      <Input.TextArea rows={5}  value={comment} onChange={onChangeComment} />
      <Button htmlType="submit" style={{position:'absolute', right:0, bottom:-50}} 
      type="primary" loading={addCommentLoading}>댓글</Button>
    </Form>
  );
 };
CommentForm.propTypes = { post : PropTypes.object.isRequired };
export default CommentForm;