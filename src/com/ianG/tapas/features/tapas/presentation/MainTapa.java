package com.ianG.tapas.features.tapas.presentation;
import com.ianG.tapas.features.tapas.data.TapaDataRepository;
import com.ianG.tapas.features.tapas.domain.*;

import java.util.*;
public class MainTapa {

    public static void MainMenu(String[] args) {
        Scanner sc = new Scanner(System.in);

        TapaRepository tapaRepository = TapaDataRepository.newInstance();
        CreateTapaUseCase crearTapa = new CreateTapaUseCase(tapaRepository);
        DeleteTapaUseCase borrarTapa = new DeleteTapaUseCase(tapaRepository);
        GetTapasUseCase obtenerTapas = new GetTapasUseCase(tapaRepository);
        GetTapaUseCase obtenerTapa = new GetTapaUseCase(tapaRepository);
        UpdateTapaUseCase actualizarTapa = new UpdateTapaUseCase(tapaRepository);

        int answer1 = 0;
        String answer2;

        System.out.println("</--------MENU---------/> \n  (1).Crear Tapa \n  (2).Borrar Tapa  \n  (3).Obtener lista de Tapas  \n  (4).Obtener Tapa en concreto  \n  (5).Actualizar Tapa \n  (6).Salir");
        System.out.print("-> Por favor seleccione: ");
        answer1 = sc.nextInt();

        // Buffer bug fix
        sc.nextLine();

        while (answer1 != 6) {
            switch (answer1) {
                case 1:
                    //-ejemplo
                    Tapa tapa = new Tapa("code", "NombreTapa", "Establecimiento", "0", "0.0", "1", "0", "ingredientes");
                    crearTapa.execute(tapa);
                    break;

                case 2:
                    System.out.print("-> Introduce el código de la Tapa que deseas eliminar : ");
                    answer2 = sc.nextLine();
                    borrarTapa.execute(answer2);
                    break;

                case 3:
                    obtenerTapas.execute();
                    break;

                case 4:
                    System.out.print("-> Introduce el código de la Tapa que deseas Obtener : ");
                    answer2 = sc.nextLine();
                    obtenerTapa.execute(answer2);
                    break;

                case 5:
                    System.out.print("-> Introduce el código de la Tapa que deseas Actualizar : ");
                    answer2 = sc.nextLine();
                    Tapa tapaActualizada = new Tapa(answer2, "Nombre nuevo", "Establecimiento nuevo", "0", "0", "0", "0", "ingredientes nuevo");
                    actualizarTapa.execute(tapaActualizada);
                    break;

                default:
                    System.out.println("Error: Por favor seleccione las opciones disponibles.");
            }

            System.out.println("</--------MENU---------/> \n  (1).Crear Tapa \n  (2).Borrar Tapa  \n  (3).Obtener lista de Tapas  \n  (4).Obtener Tapa en concreto  \n  (5).Actualizar Tapa \n  (6).Salir");
            System.out.print("-> Por favor seleccione: ");
            answer1 = sc.nextInt();

            sc.nextLine();
        }
        System.out.println("->Saliendo... \n Buen Provecho :>");
        sc.close();
    }
}