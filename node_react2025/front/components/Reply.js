import React, { useState } from "react";
import { Form, Input, Button } from 'antd';

const Reply = () => {
  // 댓글 수 상태
  const [replyCount, setReplyCount] = useState(0); 

  return (
    <Form layout="vertical" style={{ margin: '3%', position: 'relative' }}>
      <Form.Item label="reply" name="text">
        <Input.TextArea maxLength={200} />
      </Form.Item>
      <div style={{ position: 'absolute', left: 0, bottom: 10, color: '#888' }}>
        {replyCount} 댓글
      </div>
      <Form.Item>
        <Button type="primary" style={{ float: 'right' }} htmlType="submit">
          댓글
        </Button>
      </Form.Item>
    </Form>
  );
};

export default Reply;
