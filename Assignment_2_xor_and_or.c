#include <stdio.h>
#include <string.h>
int main()
{
    char str[24], c[4], a[5], b[5];
    int i, x;
    printf("Enter the string:");
    scanf("%s", str);
    x = strlen(str);
    printf("\n AND operation: ");
    for (i = 0; i <= x; i++)
    {
        a[i] = str[i] & 127;
        printf("%c", a[i]);
    }
    printf("\n XOR operation: ");
    for (i = 0; i <= x; i++)
    {
        b[i] = str[i] ^ 127;
        printf("%c", b[i]);
    }
    printf("\n OR operation: ");
    for (i = 0; i <= x; i++)
    {
        c[i] = str[i] | 127;
        printf("%c", c[i]);
    }
}