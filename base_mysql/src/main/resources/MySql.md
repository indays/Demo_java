# MySql 常见数据结构
* string
* datetime
* timestamp
* varchar 
* char
* float
* double
* decimal

# MySql ACID
* 原子性
* 隔离性
* 持久性
* 一致性


# MySql隔离级别
* 读未提交
* 读已提交
* 可重复读
* 序列化


# 死锁
* 死锁的条件：请求保持、不可剥夺 、循环等待
*

# MySql 存储引擎
* InnoDb 
> 支持行级锁、表级锁
> 支持事务
> InnoDb 支持热备份

* InnoDb MVCC


* MylSAM
> 不支持行级锁
> 不支持事务



* MySql 数据结构
> B树：每个节点都存储数据的平衡二叉树
> B+树：只有叶子节点存放数据的平衡二叉树
> 
> 
>
> 

* MySql索引
> 索引在数据结构上分为：B树索引、Hash索引
> 
> 
> 
> 
> 

* 聚簇索引  非聚簇索引
> 聚簇索引：在Innodb存储引擎中，主键索引为聚簇索引
> 非聚簇索引：非主键索引为非聚簇索引
> 







