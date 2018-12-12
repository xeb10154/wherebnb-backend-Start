package com.project3.javaReact.components;

import com.project3.javaReact.models.Booking;
import com.project3.javaReact.models.Experience;
import com.project3.javaReact.models.Property;
import com.project3.javaReact.models.User;
import com.project3.javaReact.repositories.bookings.BookRepository;
import com.project3.javaReact.repositories.experiences.ExpRepository;
import com.project3.javaReact.repositories.properties.PropRepository;
import com.project3.javaReact.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ExpRepository expRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PropRepository propRepository;


    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");


    public DataLoader() {

    }

    public Date createDate(String inputDate){
        String newDate = inputDate;
        Date date = null;
        try {
            date = dateFormatter.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public void run(ApplicationArguments args) {

        User admin = new User("Raymond", "Yau", "admin@wherebnb.com", "password");
        userRepository.save(admin);

        User neil = new User("Neil", "Ruthven", "neil@gmail.com", "password");
        userRepository.save(neil);

        Experience exp1 = new Experience("The Empire State Building", "New York City", "Landmark", "Look out on New York City from 1,050 feet above the bustling streets below",30, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1508094214466-708a7d21c5c0.jpeg?alt=media&token=041cbc1d-a7a4-4a58-8884-515bc9173fbd");
        expRepository.save(exp1);

        Experience exp2 = new Experience("Keens Steakhouse", "New York City", "Food & Drink", "Experience one of New York Citys world famous steakhouses, with the finest meats, wine and atomspheres. ",80, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2FKeens_0.jpg?alt=media&token=af39f519-46bc-445f-b9b2-36cc18bb68c3");
        expRepository.save(exp2);

        Experience exp3 = new Experience("Broadway Musical", "New York City", "Entertainment", "With 41 theatres, Broadway is full of everything from world renowned spectaculars to 1 man shows. NYC has it all.",50, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1504913659239-6abc87875a63.jpeg?alt=media&token=842ab639-a0d1-4f4f-91f1-07e155b13de6");
        expRepository.save(exp3);

        Experience exp4 = new Experience("Central Park", "New York City", "Landmark", "Nested in the heart of the city that never sleeps is a little rest bite. Central park is the perfect escape. ",0, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1459508583695-86e229e8855a.jpeg?alt=media&token=81fcdc69-26ee-4a57-8350-a423f0b8873c");
        expRepository.save(exp4);

        Experience exp5 = new Experience("The Brooklyn Bridge", "New York City", "Landmark", "Beloved, circa-1883 landmark connecting Manhattan & Brooklyn via a unique stone-&-steel design.",0, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1479779978657-f97923f70d04.jpeg?alt=media&token=c4ac948b-cb44-4453-903f-96b9dec224a6");
        expRepository.save(exp5);

        Experience exp6 = new Experience("Grand Central Train Station", "New York City", "Landmark", "Iconic train station known for its grand facade & main concourse, also offering shops & dining.",0, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1501503125584-bb1da5f56d48.jpeg?alt=media&token=cb4e2d18-2ab9-4c3f-8470-ac6e6deef0c0");
        expRepository.save(exp6);

        Experience exp7 = new Experience("The Statue of Liberty", "New York City", "Landmark", "Iconic National Monument opened in 1886, offering guided tours, a museum & city views.",20, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1445023086979-7244a12345a8.jpeg?alt=media&token=63c4a6ee-92d8-443a-a51a-7f38787f6d3a");
        expRepository.save(exp7);

        Experience exp8 = new Experience("Metropolitan museum of art", "New York City", "Arts & Culture", "A grand setting for one of the world's greatest collections of art, from ancient to contemporary.",20, "https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2FEXPERIENCES%2Fphoto-1499426600726-a950358acf16.jpeg?alt=media&token=1fd54236-5762-4d26-90e4-b63fbd7d9fb6");
        expRepository.save(exp8);


        Property prop1 = new Property("New York City",
                "Entire Flat",
                "Manhattan Midtown West Cozy&Modern",
                3,
                1,
                2,
                "Incredible unit features an open layout kitchen stylish hardwood floors high ceilings and all within an area personifying that inviting, hip SoHo Lifestyle. An absolute must! Easy-access with no stairs  a direct flow from street to building Our apartment is tastefully furnished with appealing artwork and unique artifacts a perfect home suitable for couples, families and friends looking for the ultimate in savings without compromising quality and service.",
                112,
                4,
                55.946976,
                -4.753461);

        prop1.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F1%2Fnyc1.jpg?alt=media&token=c737d9ea-3aab-4d0b-b5f5-506de1cba423");
        prop1.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F1%2Fnyc2.jpg?alt=media&token=e606be43-56db-4d94-a3b2-b1a2ce2ec3b1");
        prop1.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F1%2Fnyc4.jpg?alt=media&token=33255ab0-f487-4448-b1ff-3b4d6f7dbf5a");
        prop1.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F1%2Fnyc5.jpg?alt=media&token=810ba153-ef51-42c0-bd2e-85424d8ab908");
        prop1.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F1%2Fnyc2.jpg?alt=media&token=e606be43-56db-4d94-a3b2-b1a2ce2ec3b1");
        propRepository.save(prop1);


        Property prop2 = new Property("New York City",
                "Entire Flat",
                "COZY Chic SoHo Apartment - BEST Location in NYC!!!",
                4,
                1,
                2,
                "This apartment is located in the 6th floor with elevator. From the window you can see all 31th St. The aprtment was just renovated on summer 2018. It has place for 4 people but the ideal is for 3 people. There is TV, WIFI and NEtFlix. I try to put all the necesary staff to cook and have a cozy stay. There is hearldSquare subway stops just crossing the street.",
                90,
                4,
                -73.988940,
                40.741316);

        prop2.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F2%2Fnyc6.jpeg?alt=media&token=d5c2ebfb-a71f-423c-a340-dfedd224ae0d");
        prop2.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F2%2Fnyc7.jpg?alt=media&token=c2329b7a-5c00-4258-be02-856f8e8e5b43");
        prop2.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F2%2Fnyc8.jpg?alt=media&token=4d803daa-eab0-4a19-9647-e1dd53d2b9c5");
        prop2.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F2%2Fnyc9.jpg?alt=media&token=834e65cb-6de4-40c4-94b1-0fa2d99cc3b0");
        prop2.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F2%2Fnyc10.jpg?alt=media&token=42503e45-a976-46cb-890d-5b6561a49717");
        propRepository.save(prop2);




        Property prop3 = new Property("New York City",
                "Entire Flat",
                "A Perfect Match! The NYC All-Rounder Apartment",
                4,
                1,
                1,
                "Celebrate Christmas in New York and Watch the Ball Drop and mark a spectacular NYE in Times Square! Just a 2 min walk! Live the urban NYC Lifestyle in this modern Apartment and make Manhattan to your Backyard.You will right away fit in and feel the vibrance of the City that never sleeps.You are in the middle of the Cake: TimesSquare,PennStation,Madison Square Garden,all Subway-lines, Broadway shows,Central Park, to name a few,are all walking distance. Looking for convenience?Well look no more!",
                118,
                4,
                -73.988940,
                40.741316);

        prop3.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F3%2Fnyc11.jpg?alt=media&token=3368a5ad-b71a-41cc-9124-b1cddcef92fd");
        prop3.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F3%2Fnyc12.jpg?alt=media&token=57a9d5f3-a773-40b3-a3fd-26f46756fe1c");
        prop3.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F3%2Fnyc13.jpg?alt=media&token=33a561d9-a3ca-43ee-b222-055c4ebab7e4");
        prop3.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F3%2Fnyc14.jpg?alt=media&token=02753d6a-ae34-4329-89c4-8755be50b002");
        prop3.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F3%2Fnyc15.jpg?alt=media&token=d052b5f5-13fb-46df-957b-c8be13b659ca");
        propRepository.save(prop3);



        Property prop4 = new Property("New York City",
                "Entire Flat",
                "NEW ENTIRE APARTMENT 10 min from NYC",
                4,
                2,
                3,
                "Recently renewed, modern, spacious attic apartment, private entrance, kitchenette with fridge, microwave, coffee maker and toaster perfect to prepare breakfast, an afternoon snack or reheat delivery food; 2 bedrooms with total 3 beds. Living room with TV ( cable channels & Netflix included), wifi ,PS3 and other amenities. Perfect for 4 adults or 2 adults and upto 3 kids.",
                57,
                4,
                -73.988940,
                40.741316);

        prop4.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F4%2Fnyc16.jpg?alt=media&token=9311788b-8d25-4802-9859-8d02f558ac78");
        prop4.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F4%2Fnyc17.jpg?alt=media&token=4e616f1e-bb98-46e1-96f1-7a521f98b8da");
        prop4.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F4%2Fnyc18.jpg?alt=media&token=e4e04741-2b5a-4ca7-8292-6f773a016b73");
        prop4.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F4%2Fnyc19.jpg?alt=media&token=37bd2f58-9e6f-446c-b203-39c228886712");
        prop4.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F4%2Fnyc20.jpg?alt=media&token=f66a1b5e-04ad-4035-b76f-da5e0774c32a");

        propRepository.save(prop4);



        Property prop5 = new Property("New York City",
                "Entire Flat",
                "Centrally Located 1BR with Terrace on UWS",
                3,
                1,
                1,
                "A beautiful quaint one bedroom plus terrace in the heart of the Upper West Side! By Central Park, Riverside Park, Lincoln Square, Metropolitan Opera, Columbus Circle, and one stop from Times Square! Near Manhattan's cafes, restaurants and shops!",
                79,
                4,
                -73.988940,
                40.741316);

        prop5.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F5%2Fnyc21.jpg?alt=media&token=f0a53b07-fafe-44b3-9c6e-5317dd359e24");
        prop5.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F5%2Fnyc22.jpg?alt=media&token=b421a85d-b40d-486b-9142-2fca483743a4");
        prop5.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F5%2Fnyc23.jpg?alt=media&token=67e9801b-def1-4b4f-8f6a-6e5a2e75d057");
        prop5.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F5%2Fnyc24.jpg?alt=media&token=bb4c7728-8549-4408-9e63-0158f9d72452");
        prop5.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F5%2Fnyc25.jpg?alt=media&token=2f930049-185e-4755-b8e6-c9cc58787c50");

        propRepository.save(prop5);



        Property prop6 = new Property("New York City",
                "Entire Flat",
                "2BR Apartment with Patio, 10min to Manhattan",
                4,
                2,
                2,
                "Modern industrial style apartment in Jersey City with brand new designer hardwood furnitures. 1 min walk to Grove Street PATH, minutes away from Manhattan by PATH subway: World Trade Centre - 10 min West Village - 10 min Midtown (33 St & 6 Ave) - 20 min",
                59,
                3.8,
                -73.988940,
                40.741316);

        prop6.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F6%2Fnyc26.jpg?alt=media&token=df09abca-993e-41cf-8f50-88558db3d510");
        prop6.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F6%2Fnyc27.jpg?alt=media&token=939c8c29-1275-4e45-9481-f9906883b0f3");
        prop6.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F6%2Fnyc28.jpg?alt=media&token=ea716fa4-3f93-4ddf-b4f6-e2fe2912c2ba");
        prop6.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F6%2Fnyc29.jpg?alt=media&token=f918dd38-809c-4701-8008-29f44585c9d3");
        prop6.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F6%2Fnyc30.jpg?alt=media&token=d708ec81-87aa-4422-a569-cfd9d57db084");

        propRepository.save(prop6);


        Property prop7 = new Property("New York City",
                "Entire Flat",
                "Charming, Light-filled Studio in Historic Brooklyn Brownstone #2",
                2,
                1,
                1,
                "Recently renewed, modern, spacious attic apartment, private entrance, kitchenette with fridge, microwave, coffee maker and toaster perfect to prepare breakfast, an afternoon snack or reheat delivery food; 2 bedrooms with total 3 beds. Living room with TV ( cable channels & Netflix included), wifi ,PS3 and other amenities. Perfect for 4 adults or 2 adults and upto 3 kids.",
                57,
                4.4,
                55.946976,
                -4.753461);

        prop7.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F7%2Fnyc31.jpg?alt=media&token=3c0e9884-c386-4838-9c5e-6edc9580b012");
        prop7.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F7%2Fnyc32.jpg?alt=media&token=77604acb-ae34-4415-851c-f5b39f95c6f3");
        prop7.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F7%2Fnyc33.jpg?alt=media&token=3d902bc3-4628-4a9b-8f15-455274e57dd3");
        prop7.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F7%2Fnyc34.jpg?alt=media&token=a85e0cb1-61d1-4955-b444-79d796888cf3");
        prop7.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F7%2Fnyc35.jpg?alt=media&token=a5cc6df9-5416-42d7-9e9c-1a3d2c336bd4");

        propRepository.save(prop7);


        Property prop8 = new Property("New York City",
                "Entire Loft",
                "The Cozy Studio Midtown Manhattan",
                5,
                1,
                3,
                "Este maravilloso apartamento se encuentra en una localización inmejorable en Nueva York! Situado entre la 5a Avenida y Broadway Avenue con la 34th Street en el pleno corazón de Midtown Manhattan, a tan solo una manzana del Empire State Building y a 5 minutos caminando de Times Square, vivirás la experiencia de estar en el centro de la ciudad:",
                107,
                3,
                55.946976,
                -4.753461);

        prop8.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc36.jpg?alt=media&token=c80531b9-bc94-4cbc-b1b9-01265090aef3");
        prop8.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc37.jpg?alt=media&token=04ed52c5-9d51-44cc-8607-92c8da8d4c0c");
        prop8.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc37.jpg?alt=media&token=04ed52c5-9d51-44cc-8607-92c8da8d4c0c");
        prop8.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc39.jpg?alt=media&token=4e265d80-4172-4e03-8a2f-adcf05b83ab9");
        prop8.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc40.jpg?alt=media&token=8bb4e709-f5e8-4296-95c5-7e02cbd3a5a3");

        propRepository.save(prop8);

        Property prop9 = new Property("Rio",
                "Entire Loft",
                "The Cozy Studio Midtown Manhattan",
                5,
                1,
                3,
                "Este maravilloso apartamento se encuentra en una localización inmejorable en Nueva York! Situado entre la 5a Avenida y Broadway Avenue con la 34th Street en el pleno corazón de Midtown Manhattan, a tan solo una manzana del Empire State Building y a 5 minutos caminando de Times Square, vivirás la experiencia de estar en el centro de la ciudad:",
                107,
                3,
                55.946976,
                -4.753461);
        prop9.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc36.jpg?alt=media&token=c80531b9-bc94-4cbc-b1b9-01265090aef3");
        propRepository.save(prop9);

        Property prop10 = new Property("Rio",
                "Entire Loft",
                "The Cozy Studio Midtown Manhattan",
                5,
                1,
                3,
                "Este maravilloso apartamento se encuentra en una localización inmejorable en Nueva York! Situado entre la 5a Avenida y Broadway Avenue con la 34th Street en el pleno corazón de Midtown Manhattan, a tan solo una manzana del Empire State Building y a 5 minutos caminando de Times Square, vivirás la experiencia de estar en el centro de la ciudad:",
                107,
                3,
                55.946976,
                -4.753461);
        prop10.addImage("https://firebasestorage.googleapis.com/v0/b/wherebnb-53946.appspot.com/o/NYC%2F8%2Fnyc36.jpg?alt=media&token=c80531b9-bc94-4cbc-b1b9-01265090aef3");
        propRepository.save(prop10);



//        admin.bookProp(prop1);
//        userRepository.save(admin);
//
//        neil.bookProp(prop1);
//        neil.bookProp(prop2);
      userRepository.save(neil);

      Booking book1 = new Booking(prop1, neil, createDate("2018-02-01"), createDate("2018-02-05"));
      Booking book2 = new Booking(prop1, admin, createDate("2018-02-07"), createDate("2018-02-28"));
      bookRepository.save(book1);
      bookRepository.save(book2);

        Booking book3 = new Booking(prop2, neil, createDate("2018-02-01"), createDate("2018-02-05"));
        Booking book4 = new Booking(prop2, admin, createDate("2018-02-07"), createDate("2018-02-28"));
        bookRepository.save(book3);
        bookRepository.save(book4);

        Booking book5 = new Booking(prop3, neil, createDate("2018-02-01"), createDate("2018-02-05"));
        Booking book6 = new Booking(prop3, admin, createDate("2018-02-07"), createDate("2018-02-28"));
        bookRepository.save(book5);
        bookRepository.save(book6);

        Booking book7 = new Booking(prop4, neil, createDate("2018-02-01"), createDate("2018-02-05"));
        bookRepository.save(book7);

        Booking book8 = new Booking(prop5, neil, createDate("2018-02-01"), createDate("2018-02-05"));
        Booking book9 = new Booking(prop5, admin, createDate("2018-02-07"), createDate("2018-02-28"));
        bookRepository.save(book8);
        bookRepository.save(book9);

        Booking book10 = new Booking(prop7, neil, createDate("2018-12-01"), createDate("2018-12-25"));
        Booking book11 = new Booking(prop7, admin, createDate("2018-12-01"), createDate("2018-12-25"));
        bookRepository.save(book10);
        bookRepository.save(book11);

        Booking book12 = new Booking(prop8, neil, createDate("2018-12-01"), createDate("2018-12-29"));
        Booking book13 = new Booking(prop9, admin, createDate("2018-12-01"), createDate("2018-12-29"));
        bookRepository.save(book12);
        bookRepository.save(book13);


    }





}