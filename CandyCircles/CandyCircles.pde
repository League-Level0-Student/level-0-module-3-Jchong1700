
int ellipseX= 200; int ellipse2x = 800;



void setup(){
size(1000,600);
background(#FC73AC);
}

void draw(){
  stroke(#AFF5F7);
  int ellipseSize = 500;
    int ellipse2size = 500;

  background(#FC73AC);
for(int i = 0; i<30; i++){
  noFill();
  ellipse(ellipseX, 300, ellipseSize, ellipseSize);
  ellipseSize-=17;
}

for(int o = 0; o<30; o++){
  ellipse(ellipse2x, 300, ellipse2size, ellipse2size);
  ellipse2size-=17;
    
  }
  ellipse2x-=1;   ellipseX+=1;
       if (ellipseX>800){
         ellipseX=200;
       }
       if (ellipse2x<200){
         ellipse2x=800;
       }
}