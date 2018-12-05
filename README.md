#Java4Eos
定义是Java的基础sdk，可以在Android ，或者其他java运行上使用。
本项目参考了GitHub的开源项目：
1.Eoscommander
https://github.com/playerone-id/eoscommander.git

谢谢上述项目的开源奉献
目前规划是：
##1.实现基本的钱包功能
多个钱包的创建/删除
钱包的上锁加密/开锁解密
钱包导入私钥（包括私钥的校验）
钱包导出私钥
生成eos的私钥/公钥对

##2.基本的账户功能
根据公钥导入账户（考虑多个账户的同步情况）
账户的信息查询
账户的转账
账户调用合约（push action）

##3.离线签名交易

只有私钥，账户名的情况下如何发起一个离线交易，保证安全


