#include<stdio.h>
#include<stdlib.h>
#include <string.h>


struct person *head = NULL;
struct connection *c_head = NULL;

typedef struct person{
    char email[50];
    char firstName[50];
    char lastName[50];
    int age;
    char hometown [50];
    char hobby [50];
    struct person *next;

}Person;

typedef struct connection{
    struct person *friend1;
    struct person *friend2;
    struct connection *next;

}Connection;

Person* add(char* email)
{

    Person *temp = malloc(sizeof(Person));
    Person *place_holder;

    if (head == NULL)
    {
        head = temp;
        strcpy(head->email, email);
        printf("What is this person's first and last name?: ");
        scanf("%s %s", &head->firstName, &head->lastName);

        printf("How old is %s?: ", head->firstName);
        scanf("%d", &head->age);

        printf ("Where is %s from?(Please write answer with no spaces): ", head->firstName);
        scanf("%s", &head->hometown);

        printf("What does %s like to do?(Please enter one word answer): ", head->firstName);
        scanf("%s", &head->hobby);
        head->next = NULL;
        return head;
    }
    else
        {
            place_holder = head;

            if (place_holder->next == NULL)
            {
                if (strcmp(email, place_holder->email)==0) {
                    printf("\nA person with this email already exists\n");
                    temp = NULL;
                    return temp;
                }
            }

            while (place_holder->next != NULL)
            {
                if (strcmp(email, place_holder->email)==0) {
                    printf("\nA person with this email already exists\n");
                    temp = NULL;
                    return temp;
                }
                place_holder=place_holder->next;
            }

            if (strcmp(email, place_holder->email)==0) {
                printf("\nA person with this email already exists\n");
                temp = NULL;
                return temp;
            }

            strcpy(temp->email, email);
            printf("What is this person's first and last name?: ");
            scanf("%s %s", &temp->firstName, &temp->lastName);

            printf("How old is %s?: ", temp->firstName);
            scanf("%d", &temp->age);

            printf ("Where is %s from?(Please write answer with no spaces): ",temp->firstName);
            scanf("%s", &temp->hometown);

            printf("What does %s like to do?(Please enter one word answer): ", temp->firstName);
            scanf("%s", &temp->hobby);
            return temp;
    }


}

void add_list(char *email)
{
    Person *new = add(email);

    if (new == NULL)
    {
        free(new);
        return;
    }

    if (strcmp(head->email,new->email)==0)
    {
        return;
    }

    new->next = head;
    head = new;

}


void edit (char* email) {
    Person *temp;

    char choice[1];
    char edit[50];
    char edit2[50];
    int x;

    if (head == NULL) {
        printf("There are no emails to edit\n");
        return;
    }
    else {
        temp = head;
        if (temp->next == NULL) {
            if (strcmp(email, temp->email) == 0) {
                printf("Full name: %s %s\n", temp->firstName, temp->lastName);
                printf("Age: %d\n",temp->age);
                printf("Hometown: %s\n", temp->hometown);
                printf("Hobby: %s\n", temp->hobby);

                printf("What would you like edit?\n");
                printf("Please press [n] if you would like to edit the name\n Please press [a] if you would like to edit the age\n Please press [h] if you would like to edit the hobby\n Please press [t] if you would like to edit the hometown\n");
                scanf("%s", &choice);
                if (strcmp(choice, "n") == 0) {
                    printf("What is the new first name and last name?\n");
                    scanf("%s %s", &edit, &edit2);
                    strcpy(temp->firstName, edit);
                    strcpy(temp->lastName, edit2);
                    printf("Name changed to: %s %s", temp->firstName, temp->lastName);
                }
                if (strcmp(choice, "a") == 0) {
                    printf("What is the new age?\n");
                    scanf("%d", &x);
                    temp->age = x;
                    printf("Age changed to: %d", temp->age);
                }
                if (strcmp(choice, "h") == 0) {
                    printf("What is the new hobby? (Please answer in one word)\n");
                    scanf("%d", &edit);
                    strcpy(temp->hobby, edit);
                    printf("Hobby changed to: %s", temp->hobby);
                }
                if (strcmp(choice, "t") == 0) {
                    printf("What is the new town? (Please answer with one word)\n");
                    scanf("%d", &edit);
                    strcpy(temp->hometown, edit);
                    printf("Hometown changed to: %s", temp->hometown);
                }
            }

        } else{
            while (temp->next != NULL)
            {
                if (strcmp(email, temp->email) == 0) {
                    printf("Full name: %s %s\n", temp->firstName, temp->lastName);
                    printf("Age: %d\n",temp->age);
                    printf("Hometown: %s\n", temp->hometown);
                    printf("Hobby: %s\n", temp->hobby);

                    printf("What would you like edit?\n");
                    printf("Please press [n] if you would like to edit the name\n Please press [a] if you would like to edit the age\n Please press [h] if you would like to edit the hobby\n Please press [t] if you would like to edit the hometown\n");
                    scanf("%s", &choice);
                    if (strcmp(choice, "n") == 0) {
                        printf("What is the new first name and last name?\n");
                        scanf("%s %s", &edit, &edit2);
                        strcpy(temp->firstName, edit);
                        strcpy(temp->lastName, edit2);
                        printf("Name changed to: %s %s", temp->firstName, temp->lastName);
                        break;
                    }
                    if (strcmp(choice, "a") == 0) {
                        printf("What is the new age?\n");
                        scanf("%d", &x);
                        temp->age = x;
                        printf("Age changed to: %d", temp->age);
                        break;
                    }
                    if (strcmp(choice, "h") == 0) {
                        printf("What is the new hobby? (Please answer in one word)\n");
                        scanf("%d", &edit);
                        strcpy(temp->hobby, edit);
                        printf("Hobby changed to: %s", temp->hobby);
                        break;
                    }
                    if (strcmp(choice, "t") == 0) {
                        printf("What is the new town? (Please answer with one word)\n");
                        scanf("%d", &edit);
                        strcpy(temp->hometown, edit);
                        printf("Hometown changed to: %s", temp->hometown);
                        break;
                    }
                }
                temp = temp->next;
            }

            if (strcmp(email, temp->email) == 0) {
                printf("Full name: %s %s\n", temp->firstName, temp->lastName);
                printf("Age: %d\n",temp->age);
                printf("Hometown: %s\n", temp->hometown);
                printf("Hobby: %s\n", temp->hobby);

                printf("What would you like edit?\n");
                printf("Please press [n] if you would like to edit the name\n Please press [a] if you would like to edit the age\n Please press [h] if you would like to edit the hobby\n Please press [t] if you would like to edit the hometown\n");
                scanf("%s", &choice);
                if (strcmp(choice, "n") == 0) {
                    scanf("%s %s", &edit, &edit2);
                    strcpy(temp->firstName, edit);
                    strcpy(temp->lastName, edit2);
                    printf("Name changed to: %s %s", temp->firstName, temp->lastName);
                }
                if (strcmp(choice, "a") == 0) {
                    printf("What is the new age?\n");
                    scanf("%d", &x);
                    temp->age = x;
                    printf("Age changed to: %d", temp->age);
                }
                if (strcmp(choice, "h") == 0) {
                    printf("What is the new hobby? (Please answer in one word)\n");
                    scanf("%d", &edit);
                    strcpy(temp->hobby, edit);
                    printf("Hobby changed to: %s", temp->hobby);
                }
                if (strcmp(choice, "t") == 0) {
                    printf("What is the new town? (Please answer with one word)\n");
                    scanf("%d", &edit);
                    strcpy(temp->hometown, edit);
                    printf("Hometown changed to: %s", temp->hometown);
                }
            }
        }


    }

}


Connection* connect_friend (char* email1, char* email2)
{
    Person *temp = head;
    Person *temp_2 = head;
    Connection *connect1 = malloc(sizeof (Connection));
    Connection *check = c_head;

    if (c_head == NULL)
    {
        c_head = connect1;

        while (temp->next != NULL) {
            if (strcmp(email1, temp->email) == 0) {
                c_head->friend1 = temp;
            }
            temp = temp->next;
        }

        while  (temp_2->next != NULL) {
            if (strcmp(email2, temp_2->email) == 0) {
                c_head->friend2 = temp_2;
            }
            temp_2 = temp_2->next;
        }

        if (strcmp(email1, temp->email) == 0) {
            c_head->friend1 = temp;
        }

        if (strcmp(email2, temp_2->email) == 0) {
            c_head->friend2 = temp_2;
        }

        printf("\n%s is now connected to %s\n", c_head->friend1->email, c_head->friend2->email);
        c_head->next = NULL;
        return c_head;
    }

    else
    {
        temp = head;
        temp_2 = head;
        while (temp->next != NULL) {
            if (strcmp(email1, temp->email) == 0) {
                connect1->friend1 = temp;
                break;
            }
            temp = temp->next;
        }

        while  (temp_2->next != NULL) {
            if (strcmp(email2, temp_2->email) == 0) {
                connect1->friend2 = temp_2;
                break;
            }
            temp_2 = temp_2->next;
        }

        if (strcmp(email1, temp->email) == 0) {
            connect1->friend1 = temp;
        }

        if (strcmp(email2, temp_2->email) == 0) {
            connect1->friend2 = temp_2;
        }

        while (check->next != NULL)
        {
            if ((connect1->friend1 == check->friend1 | connect1->friend1 == check->friend2) & (connect1->friend2 == check->friend2 | connect1->friend2 == check->friend1))
            {
                printf("\nThis connection already exists\n");
                connect1 = NULL;
                return connect1;
            }
        }

        if ((connect1->friend1 == check->friend1 | connect1->friend1 == check->friend2) & (connect1->friend2 == check->friend2 | connect1->friend2 == check->friend1))
        {
            printf("\nThis connection already exists\n");
            connect1 = NULL;
            return connect1;
        }

        printf("\n%s is now connected to %s\n", email1, email2);
        return connect1;
    }
}

void connection_list(char*email1, char*email2)
{
    Connection *new = connect_friend(email1, email2);

    if (new == NULL)
    {
        return;
    }

    if ((new->friend1 == c_head->friend1) & (new->friend2 == c_head->friend2))
    {
        return;
    }

    new->next = c_head;
    c_head = new;

}

void remove_friend (char email[])
{
    Person *temp = head;
    Person *next_temp;

    Connection *temp_connection = c_head;
    Connection *next_ctemp;

    if (c_head == NULL)
    {
        printf("This person has no connections\n");
    }
    else if (c_head->next == NULL)
    {
        if (strcmp(c_head->friend1->email, email) == 0 | strcmp(c_head->friend2->email, email) == 0)
        {
            c_head = NULL;
            printf("%s has been removed from the connections list.\n", email);
        }
    }
    else
    {
        while (temp_connection->next != NULL)
        {
            if (strcmp(temp_connection->next->friend1->email, email) == 0 |(strcmp(temp_connection->next->friend2->email, email) == 0))
            {
                if (temp_connection->next->next != NULL)
                {
                    next_ctemp = temp_connection->next;
                    temp_connection->next = temp_connection->next->next;
                    free (next_ctemp);
                    printf("%s has been removed from the connections list.\n", email);
                    return;
                }
                else if (temp_connection->next->next == NULL)
                {
                    next_ctemp = temp_connection->next;
                    free (next_ctemp);
                    temp_connection->next = NULL;
                    printf("%s has been removed from the connections list.\n", email);
                }
            }
            temp_connection = temp_connection->next;
        }

    }


    if (head->next == NULL)
    {
        if (strcmp(head->email, email)==0)
        {
            next_temp = head;
            head = NULL;
            free(next_temp);
            printf("%s has been removed!!\n", email);
            return;
        }
    }

    else
    {
        while (temp->next != NULL)
        {
            if (strcmp(temp->next->email, email) == 0)
            {
                if (temp->next->next != NULL)
                {
                    next_temp = temp->next;
                    temp->next = temp->next->next;
                    free (next_temp);
                    printf("%s has been removed\n", email);
                    return;
                }
                else if (temp->next->next == NULL)
                {
                    next_temp = temp->next;
                    free (next_temp);
                    temp->next = NULL;
                    printf("%s has been removed\n", email);
                    return;
                }
            }
            temp = temp->next;
        }
    }

}


void getFriends (char *email)
{
    Connection *check = c_head;
    Person *a = head;
    char name [10];

    while (a->next != NULL)
    {
        if (strcmp(email, a->email) ==0)
        {
            strcpy(name, a->firstName);
            break;
        }
        a = a->next;
    }

    if (strcmp(email, a->email) ==0)
    {
        strcpy(name, a->firstName);
    }

    printf("\n");
    printf("\n%s:",name);

    while (check->next != NULL)
    {
        if (strcmp(email, check->friend1->email)==0)
        {
            printf("\n%s", check->friend2->firstName);
        }

        if (strcmp(email, check->friend2->email)==0)
        {
            printf("\n%s", check->friend1->firstName);
        }

        check = check->next;
    }

    if (strcmp(email, check->friend1->email)==0)
    {
        printf("\n%s", check->friend2->firstName);
    }

    if (strcmp(email, check->friend2->email)==0)
    {
        printf("\n%s", check->friend1->firstName);
    }
}

void display()
{
    Person *name = head;

    while (name->next != NULL)
    {
        getFriends(name->email);
        name = name->next;
    }
    getFriends(name->email);
}


void disconnect (char *email1, char *email2)
{
    Connection *temp_connection = c_head;
    Connection *next_ctemp;

    if (temp_connection->next == NULL)
    {
        if (strcmp(temp_connection->friend1->email,email1)==0 & strcmp(temp_connection->friend2->email,email2) == 0)
        {
            temp_connection == NULL;
            free(temp_connection);
        }
    }
    else
    {
        while (temp_connection->next != NULL)
        {
            if (strcmp(temp_connection->friend1->email,email1)==0 & strcmp(temp_connection->friend2->email,email2) == 0)
            {
                if (temp_connection->next->next != NULL)
                {
                    next_ctemp = temp_connection->next;
                    temp_connection->next = temp_connection->next->next;
                    free (next_ctemp);
                    printf("%s has been disconnected from %s.\n", temp_connection->friend1->firstName, temp_connection->friend2->firstName);
                    return;
                }
                else if (temp_connection->next->next == NULL)
                {
                    next_ctemp = temp_connection->next;
                    free (next_ctemp);
                    temp_connection->next = NULL;
                    printf("%s has been disconnected from %s.\n", temp_connection->friend1->firstName, temp_connection->friend2->firstName);
                    return;
                }
            }
            temp_connection = temp_connection->next;
        }
    }

}

void saveNetwork (char* peopleFilename, char* connectionsFilename)
{
    FILE* outFile;
    FILE* outFile2;
    Person *a = head;
    Connection *c = c_head;

    outFile = fopen(peopleFilename, "w");
    while (a->next != NULL)
    {
        fprintf(outFile, "%s, %s \n",a->firstName, a->lastName);
        fprintf(outFile,"\n");
        a = a->next;
    }

    fprintf(outFile, "%s, %s \n",a->firstName, a->lastName);
    fprintf(outFile,"\n");
    fclose(outFile);


    outFile2 = fopen(connectionsFilename, "w");
    while (c->next !=NULL)
    {
        fprintf(outFile2, "%s, %s \n",c->friend1->email, c->friend2->email);
        fprintf(outFile2,"\n");
        c = c->next;
    }

    fprintf(outFile2, "%s, %s \n",c->friend1->email, c->friend2->email);
    fprintf(outFile2,"\n");
    fclose(outFile2);

}

void retrieveNetwork (char* peopleFilename, char* connectionsFilename)
{
    FILE* outFile;
    FILE* outFile2;
    char c;

    if ((outFile = fopen(peopleFilename, "r")) == NULL)
    {
        printf("There is no friends file to read\n");
        return;
    }
    else
    {
        outFile = fopen(peopleFilename, "r");
        printf("Friends: \n");
        while((c=fgetc(outFile))!=EOF)
        {
            printf("%c",c);
        }
    }

    if ((outFile2 = fopen(connectionsFilename, "r")) == NULL)
    {
        printf("There is no connections file to read\n");
        return;
    }
    else
    {
        outFile2 = fopen(connectionsFilename, "r");
        printf("Connections: \n");
        while((c=fgetc(outFile2))!=EOF)
        {
            printf("%c",c);
        }
    }


}

int main()
{
    char choice [1];
    char email [50];
    char email2 [50];
    printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");
    scanf("%s", &choice);
    while (strcmp(choice,"q") != 0)
    {
        if (strcmp(choice,"a") == 0)
        {
            printf("Please enter an email address to add: ");
            scanf("%s", &email);
            add_list(email);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
        }
        else if (strcmp(choice,"r") == 0)
        {
            printf("Please enter an email address to remove: ");
            scanf("%s", &email);
            remove_friend(email);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }
       else if (strcmp(choice,"e") == 0)
        {
            printf("Please enter an email address to edit: ");
            scanf("%s", &email);
            edit(email);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }
       else if (strcmp(choice,"c") == 0)
        {
            printf("\nPlease enter one email address you would like to connect: ");
            scanf("%s", &email);
            printf("Please enter the second email address you would like to connect: ");
            scanf("%s", &email2);
            connection_list(email, email2);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else if (strcmp(choice, "d")==0)
        {
            display();
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else if (strcmp(choice, "g")==0)
        {
            printf("\nPlease enter the email for friends: ");
            scanf("%s",&email);
            getFriends(email);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else if (strcmp(choice, "dc") == 0)
        {
            printf("\nPlease enter one email address you would like to disconnect: ");
            scanf("%s", &email);
            printf("Please enter the second email address you would like to disconnect: ");
            scanf("%s", &email2);
            disconnect(email, email2);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else if (strcmp(choice, "s") ==0)
        {
            printf("Please enter a file name to save friends: \n");
            scanf("%s", &email);
            printf("Please enter a file name to save connections: \n");
            scanf("%s", &email2);
            saveNetwork(email, email2);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else if (strcmp(choice,"rs") ==0)
        {
            printf("Please enter a file name to read friends: \n");
            scanf("%s", &email);
            printf("Please enter a file name to read connections: \n");
            scanf("%s", &email2);
            retrieveNetwork(email, email2);
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [dc] to disconnect two people \nPress [s] to save a network \nPress [rs] to retrieve a network \nPress [q] to quit.\n");            scanf("%s", &choice);
            scanf("%s", &choice);
        }

        else
        {
            printf("\nInvalid input. Please enter a valid input\n");
            printf("\nPlease select what you would like to do: \nPress [a] to add a person \nPress [r] to remove a person \nPress [e] to edit an existing account \nPress [c] to connect two people \nPress [d] to display \nPress [g] to get friends \nPress [q] to quit.");
            scanf("%s", &choice);
        }
    }
    return 0;


}



