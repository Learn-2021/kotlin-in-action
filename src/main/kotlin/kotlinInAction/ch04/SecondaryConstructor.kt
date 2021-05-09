package kotlinInAction.ch04

import javax.naming.Context
import javax.print.attribute.AttributeSet

open class View2 {
    constructor(ctx: Context) {
        //init...
    }

    constructor(ctx: Context, attr: AttributeSet) {
        //init...
    }
}

class MyButton: View2 {
    constructor(ctx: Context): super(ctx) { //this로 다른 생성자를 호출할 수도 있다.
        //init...
    }
    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {
        //init...
    }
}