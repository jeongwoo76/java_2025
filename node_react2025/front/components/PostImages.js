import PropTypes from 'prop-types';
import React, { useCallback, useState } from 'react';
import {PlusOutlined} from '@ant-design/icons';
import ImagesZoom from './ImagesZoom';

const PostImages = ({ images }) => {
  //////////////////////////////////  code
  const [showImageZoom, setShowImageZoom] = useState(false);
  const onZoom = useCallback( () => {setShowImageZoom(true);   }, []);
  const onClose = useCallback( () => {setShowImageZoom(false); }, []);

  // 방어 코드: images가 없거나 배열이 아니거나 비어있으면 null 반환
  if (!Array.isArray(images) || images.length === 0) {
    return null;
  }

  if (images.length===1) {
    return (
      <>
         <img role="presentation" src={`http://localhost:3065/${images[0].src}`} alt={images[0].src} onClick={onZoom} />
         { showImageZoom && <ImagesZoom images={images} onClose={onClose} /> }
      </>
    );
   }
  if (images.length===2) { 
     return (
      <>
         <img role="presentation" src={`http://localhost:3065/${images[0].src}`} 
              alt={images[0].src} onClick={onZoom} style={{width:'50%', display:'inline-block'}} />
         <img role="presentation" src={`http://localhost:3065/${images[1].src}`} 
              alt={images[1].src} onClick={onZoom} style={{width:'50%', display:'inline-block'}} />
         { showImageZoom && <ImagesZoom images={images} onClose={onClose} /> }
      </>
    );
  }


  //////////////////////////////////  view   여러개
  return (
  <>
    <div>
      <img role="presentation" src={images[0].src} alt={images[0].src} width="50%" onClick={onZoom} style={{ cursor: 'pointer' }} />
      <div role="presentation" onClick={onZoom} 
          style={{display:'inline-block', width:'50%', 
          textAlign:'center', verticalAlign:'middle', cursor: 'pointer',
          }}>
        <PlusOutlined style={{ fontSize: '24px' }} />
        <br />
        {images.length-1} 개의 사진 더보기
      </div>
    </div>
    { showImageZoom && <ImagesZoom images={images} onClose={onClose} /> }
  </>
  );
};

PostImages.propTypes = {
  // images: PropTypes.arrayOf(PropTypes.object).isRequired
  images: PropTypes.arrayOf(PropTypes.shape({
    src: PropTypes.string
  })).isRequired
};

export default PostImages;