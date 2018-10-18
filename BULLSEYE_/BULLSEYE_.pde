void setup(){
size(600,600);
background(#8B4B0A);
}
 void draw(){
   int ellipseSize = 400;
   for(int i = 0; i < 10; i++){
     if(ellipseSize%2==0){
       stroke(255,0,0);
       }
  else   {
     ellipse(300,300,ellipseSize,ellipseSize);
     ellipseSize-=40;
      }
   }
   
 }