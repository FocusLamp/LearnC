#include <stdio.h>

    // Count the characters in the input
int characterCount() {
    int c;
    int prev_char = 0;  // Flag to keep track of previous character

    while ((c = getchar()) != EOF) {
        if (c == ' ') {
            if (prev_char != ' ') {
                putchar(c);
            }
        } else {
            putchar(c);
        }
        prev_char = c;
    }

    return 0;
}