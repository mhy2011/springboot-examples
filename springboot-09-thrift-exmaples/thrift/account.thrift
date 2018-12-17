namespace java com.mhy.springboot.thrift.account

service AccountService{
    /**
    * 创建账户
    **/
    string createAccount(1:string param)
}