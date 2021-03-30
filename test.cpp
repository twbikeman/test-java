#include <stdio.h>


void intToByteArray(int num, char * input) {
    input[0] = char((num >> 24) & 0xFF);
    input[1] = char((num >> 16) & 0xFF);
    input[2] = char((num >> 8) & 0xFF);
    input[3] = char(num & 0xFF);
    

}

int main(int argc, char *argv[]) {
    char a[4];
    int s = 255;
    intToByteArray(s, a);
    printf("%X\n", char(a[3]));


    return 0;

}