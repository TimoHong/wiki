package com.Timothy.wiki.service;

import com.Timothy.wiki.domain.Ebook;
import com.Timothy.wiki.domain.EbookExample;
import com.Timothy.wiki.mapper.EbookMapper;
import com.Timothy.wiki.req.EbookReq;
import com.Timothy.wiki.resp.EbookResp;
import com.Timothy.wiki.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = new ArrayList<>();
       // for (Ebook ebook: ebookList) {
            //EbookResp ebookResp = new EbookResp();
           //BeanUtils.copyProperties(ebook, ebookResp);
        //copy object
            //EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            //espList.add(ebookResp);
       // }
        List<EbookResp> List = CopyUtil.copyList(ebookList, EbookResp.class);
        return List;
    }
}
