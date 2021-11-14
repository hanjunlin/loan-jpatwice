package cn.com.yusys.loancfc.loan.jpatwice.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"cn.com.yusys.loancfc.loan.jpatwice"})
@EnableJpaRepositories("cn.com.yusys.loancfc.loan.jpatwice.dao")
@EntityScan("cn.com.yusys.loancfc.loan.jpatwice.entity")
public class LoanJpatwiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanJpatwiceApplication.class, args);
    }

}
