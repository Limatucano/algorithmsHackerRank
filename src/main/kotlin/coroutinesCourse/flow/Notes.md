# What is a FLow in kotlin

- It's a kotlin feature that serves as a reactive programming framework
- It's all about being notified about changes in yout code and sending them through a pipeline that potentially modifies them
- A flow is a coroutine that can emit multiple values over a period of time
- The flow feature is in coroutine library
- The biggest difference between simple suspend function and flow is because in flow you can return multiple items, but in simple suspend you can return only one item


## Collect
- it's executed for every single emission of the flow

## Collect Latest
- it'll cancel the old running emission if there is a new emission coming  

