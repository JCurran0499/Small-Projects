/* John Curran

This is a simple program that takes in an
input, and prints its words back out in reverse.
It does this line by line, so the first
line in the input will still be the first
line in the output. It will simply reverse each
line individually. A line cannot be more than 200
characters, or it will be cut off

*/

#include <stdio.h>
#include <string.h>

int main(void) {
    char line[201];

    while (fgets(line, 201, stdin) != EOF) {
        line[200] = NULL;

        for (int i = strlen(line) - 1; i >= 0; i--)
            printf("%c", line[i]);
        printf("\n");
    }
}
