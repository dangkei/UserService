package com.assoft.user.pagehelpler;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer{

	

	@Override
	public TransactionManager annotationDrivenTransactionManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
