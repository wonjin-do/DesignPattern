Design Pattern
==
# Stragy Pattern
## 특징
1. 전략객체가 기능을 가지고 있음.
2. 사용자에 전략객체를 장착한다.
3. 사용자가 동일 메소드명으로 호출을 하여 사용자측에는 유지보수의 변경이 없다.
4. 전략객체만 교체하면 된다.

# Template Method Pattern
## 특징
0. 구현하려는 알고리즘이 있다.
1. 알고리즘은 *일정한 프로세스*가 있다.(구조의 변경은 없다)
2. 알고리즘은 *변경가능성*이 있다.(구현은 재정의할 수 있다)

## 구현방법
+ 알고리즘을 여러단계로 나눈다.
+ 그 단계들을 여러 메소드(protected abstract Method)로 선언한다.
+ 알고리즘을 수행할 템플릿 메소드(public Method)를 만든다.
    템플릿을 사용하는 사용자는 은닉된 알고리즘을 알 수 없다.
+ 하위 클래스에서 abstract 메소드들을 구현한다.

# Adapter Pattern
## 특징
https://jusungpark.tistory.com/22<br>





