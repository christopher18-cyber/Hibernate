package com.genius;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

        AlienName name = new AlienName("Chris","Ayomide");
        Alien a1 = new Alien(104,name,"data science");


        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(com.genius.Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

//        Alien a2 = session.find(Alien.class,102);
//        session.remove(a2);
//        session.merge(a1);
//        System.out.println(a2);

        session.persist(a1);
//        int deletedCount = session.createMutationQuery("DELETE from Alien a where a.id > 102").executeUpdate();

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

//    void mergeSort(int[] arr,int l,int qright)
//    public static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int minIndex = i;
//            for (int j = 0; j < arr.length - 1; j++) {
//                if(arr[minIndex]>arr[j]){
//                    minIndex = j;
//                }
//                if(minIndex != i){
//                    int temp = arr[i];
//                    arr[i] =arr[minIndex];
//                    arr[minIndex]=temp;
//                }
//            }
//        }
//    }
}
