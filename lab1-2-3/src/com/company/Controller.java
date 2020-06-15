package com.company;

import com.company.model.Model;
import com.company.view.FileOperator;
import com.company.view.View;

import java.io.FileNotFoundException;

public class Controller {
    View dataForView = new View();
    Model dataForModel = new Model();
    FileOperator dataForFile = new FileOperator();

    public Controller() throws FileNotFoundException {
    }

    public void choice() {

        do{

        switch (dataForView.inputCommand()) {
            case 1:
                String filePath = dataForView.inputFilePath();
                if(filePath.equals("-")){
                    dataForView.printResult(dataForModel.findTheatre(dataForView.inputName(), dataForView.inputPartDate()));
                }
                else
                    dataForFile.dataWriter(filePath, dataForModel.findTheatre(dataForView.inputName(), dataForView.inputPartDate()));
                break;
            case 2:

                String filePath2 = dataForView.inputFilePath();
                if(filePath2.equals("-")){
                    dataForView.printResult(dataForModel.findName(dataForView.inputActorName()));
                }
                else
                    dataForFile.dataWriter(filePath2, dataForModel.findName(dataForView.inputActorName()));

                break;
            case 3:
                dataForView.printArr(dataForModel.getArrStr());
                break;
            case 4:
                System.exit(0);
                break;
        }

        }while (true);
    }

}