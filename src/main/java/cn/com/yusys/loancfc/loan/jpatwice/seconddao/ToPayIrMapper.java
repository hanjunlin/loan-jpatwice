package cn.com.yusys.loancfc.loan.jpatwice.seconddao;

import cn.com.yusys.loancfc.loan.jpatwice.entity.ToPayIr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：hanjl
 * @date ：Created in 2021/11/12 0012 16:55
 * @description：
 */
public interface ToPayIrMapper extends JpaRepository<ToPayIr, String> {

    List<ToPayIr> findByAcctBankCde(String acctBankCde);

}
