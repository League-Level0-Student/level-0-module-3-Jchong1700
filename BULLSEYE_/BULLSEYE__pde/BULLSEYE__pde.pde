void setup(){
size(600,600);

}
 void draw(){
   int ellipseSize = 401;
   for(int i = 0; i < 10; i++){
     if(ellipseSize%2==0){
       stroke(255,0,0);
       }
  else   {
    stroke(0,0,0);
      }
       ellipse(300,300,ellipseSize,ellipseSize);
     ellipseSize-=41;
   }
   
 } 