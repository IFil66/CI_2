package com.capital.ticTests.EN.commodities;

import com.capital.Methods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class AddDatasetToDoneFileTest {

  Methods methods = new Methods();
  ArrayList<String> done = new ArrayList<>();
  ArrayList<String> localList = new ArrayList<>();

  @Test
  @DisplayName("Add dataset of completed testing  to Done files")
  public void addDatasetToDoneFileTest() throws FileNotFoundException {
    methods.transferDataFromFileToList(localList,"src/test/resources/data/csvFiles/doneCSV/commoditiesDone.csv");
    methods.transferDataFromFileToList(done, "src/test/resources/data/csvFiles/toDoCSV/commoditiesToDo.csv");
    done.addAll(localList);
    methods.writeListToFile("src/test/resources/data/csvFiles/doneCSV/commoditiesDone.csv", done);
  }
}