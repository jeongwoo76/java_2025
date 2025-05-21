import React from "react";
import { Card, Avatar, Button, List, Comment, Popover } from 'antd';
import { EllipsisOutlined, HeartOutlined, MessageOutlined, RetweetOutlined } from '@ant-design/icons';
import PostImages from './PostImages';

const PostCard = ({post}) => {

  return(<div   style={{margin:'3%'}}> 
    <Card 
       cover={ post.Images && post.Images.length > 0 && 
                <PostImages Images={post.Images} /> }
      actions={[
          <RetweetOutlined/>,
          <HeartOutlined />,
          <MessageOutlined />,
          <Popover  content={(
            <Button.Group>
              <Button>수정</Button>
              <Button   type="primary">삭제</Button>
            </Button.Group>
          )}>
            <EllipsisOutlined/>
          </Popover>
      ]}
    >
      <Card.Meta avatar={<Avatar>{post.User.nickname[0]}</Avatar> }  
                 title={post.User.nickname} 
                 description={ post.content} />
    </Card>
    </div>);
};

export default PostCard;