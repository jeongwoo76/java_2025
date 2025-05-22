import React, { useState, useCallback } from "react";
import { Card, Avatar, Button, List, Comment, Popover } from 'antd';
import { CloudDownloadOutlined, DiscordFilled, EllipsisOutlined, HeartOutlined, HeartTwoTone, MessageOutlined, RetweetOutlined, SmallDashOutlined, SortDescendingOutlined } from '@ant-design/icons';
import PostImages from './PostImages';
import CommentForm from './CommentForm';
import { useSelector } from "react-redux";

const PostCard = ({post}) => {
  //////////////////////////////////////////  code
  const id = useSelector( (state) => state.user.user?.id  );
  // console.log( id );

  //1. 좋아요 - false 
  const [like, setLike] = useState(false);
  const onClickLike     = useCallback( () => { setLike( (prev) => !prev ); }, [] );

  //2. 댓글 - 댓글의 상태체크 / 댓글처음에는 안보이게, 클릭하면 토글기능
  const [commentOpen, setCommentOpen] = useState(false);
  const onClickComment = useCallback( () => { setCommentOpen( (prev) => !prev ); }, []);
  

  //////////////////////////////////////////  view
  return(<div   style={{margin:'3%'}}> 
    <Card 
       cover={ post.Images && post.Images.length > 0 && 
                <PostImages images={post.Images} /> }
      actions={[
          <RetweetOutlined  key="retweet"    />,
          like
            ? <HeartTwoTone  twoToneColor="#f00"   key="heart"  onClick={onClickLike}    />
            : <HeartOutlined  key="heart"                       onClick={onClickLike}    />,

          <MessageOutlined key="message" onClick={onClickComment}  />,
          
          <Popover content={(
            <Button.Group>
            { id && id === post.User.id
            ?( <><Button>수정</Button>
              <Button type="primary">삭제</Button></>
             ) 
            : <Button>신고</Button>
            }    
            </Button.Group>
          )}>
            <EllipsisOutlined/>
          </Popover>
      ]}
    >
      <Card.Meta avatar={<Avatar>{post.User.nickname[0]}</Avatar> }  
                 title={post.User.nickname} 
                 description={post.content} />
    </Card>
    {commentOpen && (
      <>
        {/* 댓글폼 */}  
        <CommentForm  post={post}/>
        {/* 댓글리스트 */} 
        <List 
          header={`${post.Comments.length} 댓글`}
          itemLayout='horizontal'
          dataSource={post.Comments}
          renderItem={ (item)=>(
            <li>
              <Comment
                avatar={<Avatar>{item.User.nickname[0]}</Avatar>}
                content={item.content}
                author={item.User.nickname}
              />
            </li>
          )
          }
        />
      </>
    )} 
    </div>);
};

export default PostCard;




