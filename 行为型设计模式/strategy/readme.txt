策略模式 :
1 : 什么是策略模式
 策略模式将可变的部分从程序中抽象分离成算法接口 , 在该接口下分别封装一系列算法实现 .
2 : 实例需求 : 设计一个鸭子的程序
 2.1 赋予鸭子没有的能力->飞行
 2.2 设计更多类型的鸭子

3.策略模式中的设计原则
    3.1 找出应用中需要变化的部分,把它们独立出来,不要和那些不需要变化的代码混在一起(鸭子:不变的是拥有飞行的能力,变化的是飞行的方式)
    3.2 面向接口编程
    3.3 多用组合,少用继承
4.策略模式的实现
    4.1
5.优点
    5.1 使用组合,使架构更加灵活
    5.2 富有弹性,可以较好的应对变化(开-闭原则)
    5.3 更好的代码复用
    5.4 消除了大量的条件语句
6.缺点
    6.1 客户代码需要了解每个策略的实现细节(每个鸭子实现类都必须要注入一个策略实现)
    6.2 增加了对象的数目
7.适用场景
    7.1 许多相关的类仅仅是行为差异
    7.2 运行时选取不同的算法变体(算法实现)
    7.3通过条件语句在多个分支中选取其一