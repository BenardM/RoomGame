package Game;

import processing.core.PFont;


public class EnigmeMemoire extends Enigme {
	
			
		  public void settings() {
		    size(500, 500);
		    //font =createFont("Georgia", 12);
		    //stroke(255);
			 reset();
		   //public void draw() {
		   // background(255);
		   // fill(0);
		   // ellipse(100, 50, 10, 10);
		  }
		  PFont font;

		int[] pickup=new int[10];
		int[] num100=new int[100];
		boolean[] boolnum=new boolean[100];
		boolean[] bool10=new boolean[10];
		boolean hide=false;
		int num=30;
		int cnt=0;
		int buttonCnt=0;
		boolean gameover=false;

		//void setup(){
		//  size(500,500);
		//  font = loadFont("Monaco-10.vlw");
		//  textFont(font,10);
		//  stroke(255);
		//  reset();
		//}

		void reset(){
		 // noFill();  
		  for(int i=0;i<10;i++){
		    bool10[i]=false;
		  }
		  for(int i=0;i<100;i++){
		    boolnum[i]=false;
		  }
		  selectTen();
		  hide=false;
		  num=30;
		  cnt=0;
		  buttonCnt=0;
		  gameover=false;
		}

		public void draw(){
		frame.setLocation(100, 100);
		  background(0);
		  noFill();
		  answer();
		  for(int i=0;i<10;i++){
		    if(bool10[i]){
		      fill(200,0,0);
		    }
		    else{
		      noFill();
		    }
		    rect(i*40+50,20,30,30);
		    if(gameover){
		      hide=false;
		    }   
		    if(hide){
		      fill(0,0,0,0);
		    }
		    else{
		      fill(255);
		    }  
		    if(pickup[i]>=0 && pickup[i]<10){
		      text(pickup[i],i*40+50+12,20+19);
		    }
		    else if(pickup[i]>=10 && pickup[i]<100){
		      text(pickup[i],i*40+50+9,20+19);
		    }
		    else{
		      text(pickup[i],i*40+50+6,20+19);
		    }
		  }
		  for(int y=0; y<10;y++){
		    for(int x=0;x<10;x++){
		      if(boolnum[x+10*y]){
		        fill(80);
		      }
		      else{
		        noFill();
		      }
		      rect(x*40+50,y*40+80,30,30);
		      fill(255);
		      if(hide){
		        if(x+10*y+1>=0 && x+10*y+1<10){
		          text(x+10*y+1,x*40+50+12,y*40+80+19);
		        }
		        else if(x+10*y+1>=10 && x+10*y+1<100){
		          text(x+10*y+1,x*40+50+9,y*40+80+19);
		        }
		        else{
		          text(x+10*y+1,x*40+50+6,y*40+80+19);
		        }
		      }
		    }
		  }
		  if(cnt>60){
		    num--;
		    cnt=0;
		  }
		  cnt++;
		  if(gameover){
		    text("GAME OVER! Press 'r' key to restart the game.",90,69);
		  }else if(num<0){
		    num=-1;
		    hide=true;
		    text("Click to select the same numbers from the below.",90,69);
		  }
		  else{
		    text("Momorize the above ten numbers within "+nf(num,2)+" seconds.",90,69);
		  }

		}

		public void mousePressed(){
		  if(num<0 && gameover==false){
		    for(int y=0;y<10;y++){
		      for(int x=0;x<10;x++){
		        if(mouseX>x*40+50 && mouseX<x*40+80 && mouseY>y*40+80 && mouseY<y*40+110){
		          //boolnum[x+10*y]=!boolnum[x+10*y];
		          if(boolnum[x+10*y]==false){
		            boolnum[x+10*y]=true;
		            buttonCnt++;
		            if(buttonCnt>9){
		              gameover=true;
		            }
		          }         
		        }
		      }
		    }
		  }
		}

		void selectTen(){
		  for(int i=0;i<10;i++){
		    pickup[i]=(int) (random(1,(float) 100.5));
		    if(i>0){
		      for(int j=i-1;j>=0;j--){
		        if(pickup[i]==pickup[j]){
		          pickup[i]=(int)(random(1,(float)100.5));
		        }
		      }
		    }
		  }
		  pickup=sort(pickup);
		}

		void answer(){
		  for(int i=0;i<10;i++){
		    if(boolnum[pickup[i]-1]==true){
		      bool10[i]=true;
		    }
		  }
		}

		public void keyPressed(){
		  if(key=='r'){
		    reset();
		    background(0);
		  }
		}
		

	
}
