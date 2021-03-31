#include<U8x8lib.h>

#define ldr A0

U8X8_SSD1306_128X64_NONAME_HW_I2C u8x8(/* reset=*/ U8X8_PIN_NONE);

void setup() {
  u8x8.setBusClock(100000);
  u8x8.begin();
  u8x8.setFlipMode(1);
  pinMode(ldr, INPUT);
}

void loop() {
  int val = analogRead(ldr);
  u8x8.clear();
  u8x8.setFont(u8x8_font_amstrad_cpc_extended_r);
  if(val>400) {
    u8x8.draw2x2String(2, 3, "BRIGHT"); 
  }
  else{
    u8x8.draw2x2String(4, 3, "DARK");
  }
  u8x8.refreshDisplay();
  delay(500);
}
