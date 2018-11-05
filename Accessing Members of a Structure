#include<stdio.h>
#include<stdlib.h>

typedef struct distance
{
    int feet;
    double inches;
}distance;

distance addDistance(struct distance a, struct distance b)
{
        int totalFeet = a.feet + b.feet;
        double totalInches = a.inches + b.inches;
        if (totalInches >= 12)
        {
                totalFeet += 1;
                totalInches -= 12.0;

        }
        distance c;
        c.feet = totalFeet;
        c.inches = totalInches;
        return c;
}

int main()
{
        distance a;
        distance b;
        printf("First distance \nEnter feet: ");
        scanf("%d", &a.feet);
        printf("Enter inch: ");
        scanf("%lf", &a.inches);
        printf("Second distance \nEnter feet: ");
        scanf("%d", &b.feet);
        printf("Enter inch: ");
        scanf("%lf", &b.inches);
        distance c = addDistance(a,b);
        int addFeet = c.feet;
        double addInches = c.inches;
        printf("Sum of distances = %d\'-%0.1lf\"", addFeet, addInches);
}

