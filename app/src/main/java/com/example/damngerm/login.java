package com.example.damngerm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class login extends AppCompatActivity {
    Button ptt,xws,djt,A,B,C,D,buttonA,buttonB,buttonC,buttonD,change,action,end,C_A,C_B,C_D,C_C;
    TextView textView,textdjt,textxws;
    private int iptt,ixws,idjt,p;
    ImageButton Achoose,Bchoose,Dchoose,Cchoose;
    public int time=1000;
    public int AA=0,BB=0,CC=0,DD=0;
    private int pttt;//结算条件变量
    private int ptttt,change1;
    public int ptt_start=30,xws_start=15,djt_start=15;//初始化变量
    double i;
    public int ptt_sui=1,xws_sui=1,djt_sui=1;
    Vibrator vibrator;
    public int k,j,jinengC=1,jinengD=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        ptt=findViewById(R.id.ptt);
        djt=findViewById(R.id.djt);
        xws=findViewById(R.id.xws);
        A=findViewById(R.id.A);
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        D=findViewById(R.id.D);
        buttonA=findViewById(R.id.buttonA);
        buttonB=findViewById(R.id.buttonB);
        buttonC=findViewById(R.id.buttonC);
        buttonD=findViewById(R.id.buttonD);
        textView=findViewById(R.id.textView);
        textdjt=findViewById(R.id.textdjt);
        textxws=findViewById(R.id.textxws);
        Achoose=findViewById(R.id.细菌A);
        Bchoose=findViewById(R.id.Bchoose);
        Cchoose=findViewById(R.id.Cchoose);
        Dchoose=findViewById(R.id.Dchoose);
        change=findViewById(R.id.change);
        action=findViewById(R.id.action);
        end=findViewById(R.id.end);
        C_A=findViewById(R.id.C_A);
        C_B=findViewById(R.id.C_B);
        C_D=findViewById(R.id.C_D);
        C_C=findViewById(R.id.C_C);

        //初始化
        Achoose.setVisibility(View.VISIBLE);
        Bchoose.setVisibility(View.VISIBLE);
        Cchoose.setVisibility(View.VISIBLE);
        Dchoose.setVisibility(View.VISIBLE);
        A.setVisibility(View.VISIBLE);
        B.setVisibility(View.VISIBLE);
        C.setVisibility(View.VISIBLE);
        D.setVisibility(View.VISIBLE);
        ptt.setVisibility(View.GONE);
        djt.setVisibility(View.GONE);
        xws.setVisibility(View.GONE);
        action.setVisibility(View.GONE);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Update update1= new Update();
                update1.updateUserDataptt(ptt_start);
                update1.updateUserDatadjt(djt_start);
                update1.updateUserDataxws(xws_start);
            }
        });
        //初始化

        //选择角色
        Achoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Achoose.setVisibility(View.GONE);
                Bchoose.setVisibility(View.GONE);
                Cchoose.setVisibility(View.GONE);
                Dchoose.setVisibility(View.GONE);
                B.setVisibility(View.GONE);
                C.setVisibility(View.GONE);
                D.setVisibility(View.GONE);
                action.setVisibility(View.VISIBLE);
                AA=1;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        System.out.println(-5);
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        update1.updateUserDatapttA(ptt_sui);
                        update1.updateUserDatadjtA(djt_sui);
                        update1.updateUserDataxwsA(xws_sui);
                        iptt = ptt_sui;
                        idjt=djt_sui;
                        ixws=xws_sui;
                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                vibrator.vibrate(30);
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        Bchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                Achoose.setVisibility(View.GONE);
                Bchoose.setVisibility(View.GONE);
                Cchoose.setVisibility(View.GONE);
                Dchoose.setVisibility(View.GONE);
                A.setVisibility(View.GONE); //visible
                C.setVisibility(View.GONE);
                D.setVisibility(View.GONE);
                action.setVisibility(View.VISIBLE);
                BB=1;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        update1.updateUserDatapttB(ptt_sui);
                        update1.updateUserDatadjtB(djt_sui);
                        update1.updateUserDataxwsB(xws_sui);
                        iptt = ptt_sui;
                        idjt=djt_sui;
                        ixws=xws_sui;
                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        Cchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                Achoose.setVisibility(View.GONE);
                Bchoose.setVisibility(View.GONE);
                Cchoose.setVisibility(View.GONE);
                Dchoose.setVisibility(View.GONE);
                A.setVisibility(View.GONE);
                B.setVisibility(View.GONE);
                D.setVisibility(View.GONE);
                action.setVisibility(View.VISIBLE);
                CC=1;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        update1.updateUserDatapttC(ptt_sui);
                        update1.updateUserDatadjtC(djt_sui);
                        update1.updateUserDataxwsC(xws_sui);
                        iptt = ptt_sui;
                        idjt=djt_sui;
                        ixws=xws_sui;

                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        Dchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                Achoose.setVisibility(View.GONE);
                Bchoose.setVisibility(View.GONE);
                Cchoose.setVisibility(View.GONE);
                Dchoose.setVisibility(View.GONE);
                A.setVisibility(View.GONE);
                C.setVisibility(View.GONE);
                B.setVisibility(View.GONE);
                action.setVisibility(View.VISIBLE);
                DD=1;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        i=Math.random();
                        if(i<0.4) ptt_sui=ptt_sui+1;
                        if(i>=0.4&&i<0.7) xws_sui=xws_sui+1;
                        if(i>=0.7&&i<1.1) djt_sui=djt_sui+1;
                        update1.updateUserDatapttD(ptt_sui);
                        update1.updateUserDatadjtD(djt_sui);
                        update1.updateUserDataxwsD(xws_sui);
                        iptt = ptt_sui;
                        idjt=djt_sui;
                        ixws=xws_sui;

                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });
        //选择角色

        //游戏阶段
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                jinengC=1;
                jinengD=2;
                action.setVisibility(View.GONE);
                change.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        select seclect1 = new select();
                        Update update1=new Update();
                        if (AA == 1) {
                            iptt = seclect1.selectpttA();
                            idjt = seclect1.selectdjtA();
                            ixws = seclect1.selectxwsA();
                            for (k = 1; k < 3; k++) {
                                i = Math.random();
                                if (i < 0.4) {
                                    ptt_start = seclect1.selectptt();
                                    if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.4 && i < 0.7) {
                                    xws_start = seclect1.selectxws();
                                    if (xws_start != 0) {
                                        xws_start--;
                                        update1.updateUserDataptt(xws_start);
                                        ixws = ixws + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.7 && i < 1.1) {
                                    djt_start = seclect1.selectxws();
                                    if (djt_start != 0) {
                                        djt_start--;
                                        update1.updateUserDataptt(djt_start);
                                        idjt = idjt + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                            }
                            update1.updateUserDatapttA(iptt);
                            update1.updateUserDataxwsA(ixws);
                            update1.updateUserDatadjtA(idjt);
                        }
                        if (BB == 1) {
                            iptt = seclect1.selectpttB();
                            idjt=seclect1.selectdjtB();
                            ixws=seclect1.selectxwsB();
                            for (k = 1; k < 3; k++) {
                                i = Math.random();
                                if (i < 0.4) {
                                    ptt_start = seclect1.selectptt();
                                    if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.4 && i < 0.7) {
                                    xws_start = seclect1.selectxws();
                                    if (xws_start != 0) {
                                        xws_start--;
                                        update1.updateUserDataptt(xws_start);
                                        ixws = ixws + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.7 && i < 1.1) {
                                    djt_start = seclect1.selectxws();
                                    if (djt_start != 0) {
                                        djt_start--;
                                        update1.updateUserDataptt(djt_start);
                                        idjt = idjt + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                            }
                            update1.updateUserDatapttA(iptt);
                            update1.updateUserDataxwsA(ixws);
                            update1.updateUserDatadjtA(idjt);
                        }
                        if (CC == 1){
                            iptt = seclect1.selectpttC();
                            idjt=seclect1.selectdjtC();
                            ixws=seclect1.selectxwsC();
                            for (k = 1; k < 3; k++) {
                                i = Math.random();
                                if (i < 0.4) {
                                    ptt_start = seclect1.selectptt();
                                    if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.4 && i < 0.7) {
                                    xws_start = seclect1.selectxws();
                                    if (xws_start != 0) {
                                        xws_start--;
                                        update1.updateUserDataptt(xws_start);
                                        ixws = ixws + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.7 && i < 1.1) {
                                    djt_start = seclect1.selectxws();
                                    if (djt_start != 0) {
                                        djt_start--;
                                        update1.updateUserDataptt(djt_start);
                                        idjt = idjt + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                            }
                            update1.updateUserDatapttA(iptt);
                            update1.updateUserDataxwsA(ixws);
                            update1.updateUserDatadjtA(idjt);
                        }
                        if (DD == 1){
                            iptt = seclect1.selectpttD();
                            idjt=seclect1.selectdjtD();
                            ixws=seclect1.selectxwsD();
                            for (k = 1; k < 3; k++) {
                                i = Math.random();
                                if (i < 0.4) {
                                    ptt_start = seclect1.selectptt();
                                    if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.4 && i < 0.7) {
                                    xws_start = seclect1.selectxws();
                                    if (xws_start != 0) {
                                        xws_start--;
                                        update1.updateUserDataptt(xws_start);
                                        ixws = ixws + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                                if (i >= 0.7 && i < 1.1) {
                                    djt_start = seclect1.selectxws();
                                    if (djt_start != 0) {
                                        djt_start--;
                                        update1.updateUserDataptt(djt_start);
                                        idjt = idjt + 1;
                                    } else if (ptt_start != 0) {
                                        ptt_start--;
                                        update1.updateUserDataptt(ptt_start);
                                        iptt = iptt + 1;
                                    }
                                }
                            }
                            update1.updateUserDatapttA(iptt);
                            update1.updateUserDataxwsA(ixws);
                            update1.updateUserDatadjtA(idjt);
                        }
                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                p=0;
                change.setVisibility(View.GONE);
                end.setVisibility(View.VISIBLE);
                ptt.setVisibility(View.VISIBLE);
                djt.setVisibility(View.VISIBLE);
                xws.setVisibility(View.VISIBLE);
            }
        });

        ptt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                p++;
                if (AA==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            iptt=seclect1.selectpttA()-1;
                            i=Math.random();
                            if(i<=0.5){
                                update1.updateUserDatapttA(iptt);
                                idjt=seclect1.selectdjtA()+1;
                                update1.updateUserDatadjtA(idjt);
                            }
                            else {
                                update1.updateUserDatapttA(iptt);
                                ixws=seclect1.selectdjtA()+1;
                                update1.updateUserDataxwsA(idjt);
                            }
                        }
                    }).start();
                }
                if (BB==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            iptt=seclect1.selectpttB()-1;
                            i=Math.random();
                            if(i<=0.5){
                                update1.updateUserDatapttB(iptt);
                                idjt=seclect1.selectdjtB()+1;
                                update1.updateUserDatadjtB(idjt);
                            }
                            else {
                                update1.updateUserDatapttB(iptt);
                                ixws=seclect1.selectdjtB()+1;
                                update1.updateUserDataxwsB(idjt);
                            }
                        }
                    }).start();
                }
                if (CC==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            iptt=seclect1.selectpttA()-1;
                            i=Math.random();
                            if(i<=0.5){
                                update1.updateUserDatapttC(iptt);
                                idjt=seclect1.selectdjtC()+1;
                                update1.updateUserDatadjtC(idjt);
                            }
                            else {
                                update1.updateUserDatapttC(iptt);
                                ixws=seclect1.selectdjtC()+1;
                                update1.updateUserDataxwsC(idjt);
                            }
                        }
                    }).start();
                }
                if (DD==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            iptt=seclect1.selectpttD()-1;
                            i=Math.random();
                            if(i<=0.5){
                                update1.updateUserDatapttD(iptt);
                                idjt=seclect1.selectdjtD()+1;
                                update1.updateUserDatadjtD(idjt);
                            }
                            else {
                                update1.updateUserDatapttD(iptt);
                                ixws=seclect1.selectdjtD()+1;
                                update1.updateUserDataxwsD(idjt);
                            }
                        }
                    }).start();
                }
                if(p==2){
                    ptt.setVisibility(View.GONE);
                    djt.setVisibility(View.GONE);
                    xws.setVisibility(View.GONE);
                }
            }
        });

        djt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                p++;
                if (AA==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            idjt=seclect1.selectdjtA()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDatadjtA(idjt);
                                iptt=seclect1.selectpttA()+1;
                                update1.updateUserDatapttA(iptt);
                            }
                        }
                    }).start();
                }
                if (BB==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            idjt=seclect1.selectdjtB()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDatadjtB(idjt);
                                iptt=seclect1.selectpttB()+1;
                                update1.updateUserDatapttB(iptt);
                            }
                        }
                    }).start();
                }
                if (CC==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            idjt=seclect1.selectdjtC()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDatadjtC(idjt);
                                iptt=seclect1.selectpttC()+1;
                                update1.updateUserDatapttC(iptt);
                            }
                        }
                    }).start();
                }
                if (DD==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            idjt=seclect1.selectdjtD()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDatadjtD(idjt);
                                iptt=seclect1.selectpttD()+1;
                                update1.updateUserDatapttD(iptt);
                            }
                        }
                    }).start();
                }
                if(p==2){
                    ptt.setVisibility(View.GONE);
                    djt.setVisibility(View.GONE);
                    xws.setVisibility(View.GONE);
                }
            }
        });

        xws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                p++;
                if (AA==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            ixws=seclect1.selectxwsA()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDataxwsA(idjt);
                                iptt=seclect1.selectpttA()+1;
                                update1.updateUserDatapttA(iptt);
                            }
                        }
                    }).start();
                }
                if (BB==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            ixws=seclect1.selectxwsB()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDataxwsB(idjt);
                                iptt=seclect1.selectpttB()+1;
                                update1.updateUserDatapttB(iptt);
                            }
                        }
                    }).start();
                }
                if (CC==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            ixws=seclect1.selectxwsC()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDataxwsC(idjt);
                                iptt=seclect1.selectpttC()+1;
                                update1.updateUserDatapttC(iptt);
                            }
                        }
                    }).start();
                }
                if (DD==1){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select seclect1 = new select();
                            Update update1=new Update();
                            ixws=seclect1.selectxwsD()-1;
                            i=Math.random();
                            if(i<=0.8){
                                update1.updateUserDataxwsD(idjt);
                                iptt=seclect1.selectpttD()+1;
                                update1.updateUserDatapttD(iptt);
                            }
                        }
                    }).start();
                }
                if(p==2){
                    ptt.setVisibility(View.GONE);
                    djt.setVisibility(View.GONE);
                    xws.setVisibility(View.GONE);
                }
            }
        });


        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                end.setVisibility(View.GONE);
                action.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        select seclect1=new select();
                        Update update1=new Update();
                        if(AA==1) {
                            ptttt=seclect1.selectpttA()-1;
                            pttt=ptttt;
                            update1.updateUserDatapttA(pttt);
                        }
                        if(BB==1) {
                            ptttt=seclect1.selectpttB()-1;
                            pttt=ptttt;
                            update1.updateUserDatapttB(pttt);
                        }
                        if(CC==1) {
                            ptttt=seclect1.selectpttC()-1;
                            pttt=ptttt;
                            update1.updateUserDatapttC(pttt);
                        }
                        if(DD==1) {
                            ptttt=seclect1.selectpttD()-1;
                            pttt=ptttt;
                            update1.updateUserDatapttC(pttt);
                        }
                    }
                }).start();
                try {
                    Thread.sleep(time+1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(pttt<0){
                    A.setVisibility(View.GONE);
                    C.setVisibility(View.GONE);
                    B.setVisibility(View.GONE);
                    D.setVisibility(View.GONE);
                    System.out.println("Game over");
                    action.setVisibility(View.GONE);
                }
                textView.setText(pttt+"");
            }
        });
        //游戏阶段

        //技能描述
        A.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonA.setVisibility(View.VISIBLE);
                return false;
            }
        });
        B.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonB.setVisibility(View.VISIBLE);
                return false;
            }
        });

        C.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonC.setVisibility(View.VISIBLE);
                return false;
            }
        });

        D.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonD.setVisibility(View.VISIBLE);
                return false;
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonD.setVisibility(View.GONE);
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonC.setVisibility(View.GONE);
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonB.setVisibility(View.GONE);
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA.setVisibility(View.GONE);
            }
        });
        //技能描述

        //细菌操作
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        select select1=new select();
                        int xws=select1.selectxwsA();
                        if(xws>0){
                            xws=xws-1;
                            int djt=select1.selectdjtA()+2;
                            int ptt=select1.selectpttA();
                            ixws=xws;
                            idjt=djt;
                            iptt=ptt;
                            Update update=new Update();
                            update.updateUserDataxwsA(xws);
                            update.updateUserDatadjtA(djt);
                        }
                    }
                }).start();
                try {
                    Thread.sleep(time);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        select select1=new select();
                        int djt=select1.selectdjtB();
                        if(djt>0){
                            djt=djt-1;
                            int ptt=select1.selectpttB()+3;
                            int xws=select1.selectxwsB();
                            ixws=xws;
                            idjt=djt;
                            iptt=ptt;
                            Update update=new Update();
                            update.updateUserDatapttB(ptt);
                            update.updateUserDatadjtB(djt);
                        }
                    }
                }).start();
                try {
                    Thread.sleep(time);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                textView.setText(iptt+"");
                textdjt.setText(idjt+"");
                textxws.setText(ixws+"");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if(jinengC>0) {
                    jinengC--;
                    k=0;
                    j=0;
                    C_D.setVisibility(View.VISIBLE);
                    C_B.setVisibility(View.VISIBLE);
                    C_A.setVisibility(View.VISIBLE);
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select select1 = new select();
                            int ptt = select1.selectpttC() -1;
                            int xws = select1.selectxwsC();
                            int djt = select1.selectdjtC();
                            ixws = xws;
                            idjt = djt;
                            iptt = ptt;
                            for(k=0;k<=3;k++){
                                i=Math.random();
                                if (i<0.3){
                                    iptt++;
                                }
                                else if(i>=0.3&&i<0.7){
                                    ixws++;
                                }
                                else {
                                    idjt++;
                                }
                            }
                            Update update = new Update();
                            update.updateUserDatapttC(iptt);
                            update.updateUserDatadjtC(idjt);
                            update.updateUserDataxwsC(ixws);
                        }
                    }).start();

                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    textView.setText(iptt + "");
                    textdjt.setText(idjt + "");
                    textxws.setText(ixws + "");
                }
            }
        });

        C_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                k++;
                j++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        select select1=new select();
                        i=Math.random();
                        if (i<0.3){
                            j=select1.selectpttA()-1;
                            update1.updateUserDatapttA(j);
                        }
                        else if (i>=0.3&&i<1.2){
                            j=select1.selectdjtA()-1;
                            update1.updateUserDatadjtA(j);
                        }
                        else {
                            j=select1.selectxwsA()-1;
                            update1.updateUserDataxwsA(j);
                        }
                    }
                }).start();
                if(k==3){
                    C_D.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
                if(j==2){
                    C_C.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
            }
        });
        C_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                k++;
                j++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        select select1=new select();
                        i=Math.random();
                        if (i<0.3){
                            j=select1.selectpttA()-1;
                            update1.updateUserDatapttB(j);
                        }
                        else if (i>=0.3&&i<1.2){
                            j=select1.selectdjtA()-1;
                            update1.updateUserDatadjtB(j);
                        }
                        else {
                            j=select1.selectxwsA()-1;
                            update1.updateUserDataxwsB(j);
                        }
                    }
                }).start();
                if(k==3){
                    C_D.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
                if(j==2){
                    C_C.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
            }
        });
        C_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                k++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        select select1=new select();
                        i=Math.random();
                        if (i<0.3){
                            j=select1.selectpttA()-1;
                            update1.updateUserDatapttD(j);
                        }
                        else if (i>=0.3&&i<1.2){
                            j=select1.selectdjtA()-1;
                            update1.updateUserDatadjtD(j);
                        }
                        else {
                            j=select1.selectxwsA()-1;
                            update1.updateUserDataxwsD(j);
                        }
                    }
                }).start();
                if(k==3){
                    C_D.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
                if(j==2){
                    C_C.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
            }
        });

        C_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                j++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Update update1=new Update();
                        select select1=new select();
                        i=Math.random();
                        if (i<0.3){
                            j=select1.selectpttA()-1;
                            update1.updateUserDatapttC(j);
                        }
                        else if (i>=0.3&&i<1.2){
                            j=select1.selectdjtA()-1;
                            update1.updateUserDatadjtC(j);
                        }
                        else {
                            j=select1.selectxwsA()-1;
                            update1.updateUserDataxwsC(j);
                        }
                    }
                }).start();
                if(k==3){
                    C_D.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
                if(j==2){
                    C_C.setVisibility(View.GONE);
                    C_B.setVisibility(View.GONE);
                    C_A.setVisibility(View.GONE);
                }
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if(jinengD>0) {
                    jinengD--;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            select select1 = new select();
                            int ptt = select1.selectpttD() - 1;
                            int xws = select1.selectxwsD();
                            int djt = select1.selectdjtD();
                            ixws = xws;
                            idjt = djt;
                            iptt = ptt;
                            for(k=0;k<=3;k++){
                                i=Math.random();
                                if (i<0.3){
                                    iptt++;
                                }
                                else if(i>=0.3&&i<0.7){
                                    ixws++;
                                }
                                else {
                                    idjt++;
                                }
                            }
                            Update update = new Update();
                            update.updateUserDatapttD(iptt);
                            update.updateUserDatadjtD(idjt);
                            update.updateUserDataxwsD(ixws);
                        }
                    }).start();
                    j = 0;
                    k = 0;
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    C_B.setVisibility(View.VISIBLE);
                    C_A.setVisibility(View.VISIBLE);
                    C_C.setVisibility(View.VISIBLE);
                    textView.setText(iptt + "");
                    textdjt.setText(idjt + "");
                    textxws.setText(ixws + "");
                }
            }
        });
        //细菌操作
    }
}
