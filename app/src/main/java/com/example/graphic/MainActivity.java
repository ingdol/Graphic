package com.example.graphic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

class MyView extends View { //view에서 상속받아 MyView 클래스를 작성한다.
    public MyView(Context context){ //매개변수 context를 가진 MyView 생성자를 선언한다.
        super(context); //context를 부모클래스로 전달한다.
        setBackgroundColor(Color.BLUE); //배경색은 파랑으로 한다.
    }

    @Override
    protected void onDraw(Canvas canvas){ // 매개변수 canvas를 가진 onDraw 클래스를 작성한다.
        Paint paint = new Paint(); //paint 객체를 생성한다.
        paint.setColor(Color.YELLOW); // paint의 색은 노랑으로 한다.
        paint.setStrokeWidth(20); //펜의 두께를 20으로 한다.
        canvas.drawLine(100, 100, 700, 100, paint);
        //(100, 100)부터 (700,100)까지의 직선을 그린다.
        canvas.drawRect(100, 300, 700, 700, paint);
        //좌측 상단 (100,300) 우측 상단 (700, 700)인 사각형을 그린다.
        canvas.drawCircle(300, 1200, 200, paint);
        //중심 (300, 1200) 반지름 200인 원을 그린다.
        paint.setTextSize(80); //텍스트 사이즈는 80으로 한다.
        canvas.drawText("This is a test.", 100, 900, paint);
        //(100, 900) 위치에 텍스트를 그린다.
    }
}

public class MainActivity extends AppCompatActivity {
    //AppCompatActivity 클래스를 상속받아 MainActivity 클래스를 작성한다.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //onCreate 메소드의 매개 변수인 savedInstanceState는 앱의 이전 실행 상태를 전달한다.
        super.onCreate(savedInstanceState); //클릭할 때 부모클래스의 onCreate()를 호출한다.
        MyView w = new MyView(this); //MyView에 context 정보를 가져온다.
        setContentView(w); //MyView를 띄운다.
    }
}
