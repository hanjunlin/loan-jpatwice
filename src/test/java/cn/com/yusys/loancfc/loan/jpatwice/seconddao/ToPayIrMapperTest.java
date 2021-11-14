package cn.com.yusys.loancfc.loan.jpatwice.seconddao;

import cn.com.yusys.loancfc.loan.jpatwice.boot.LoanJpatwiceApplication;
import cn.com.yusys.loancfc.loan.jpatwice.entity.ToPayIr;
import cn.com.yusys.loancfc.loan.jpatwice.primarydao.ToPayIrDao;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = {LoanJpatwiceApplication.class})
@RunWith(SpringRunner.class)
@Slf4j
class ToPayIrMapperTest {

    @Autowired
    private ToPayIrMapper toPayIrMapper;

    @Autowired
    private ToPayIrDao toPayIrDao;

    @Test
    void findAll() {
        List<ToPayIr> all = toPayIrMapper.findAll();
        log.info("mapper:" + JSON.toJSONString(all));
        List<ToPayIr> all1 = toPayIrDao.findAll();
        log.info("dao:" + JSON.toJSONString(all1));
    }

}