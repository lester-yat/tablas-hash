package com.lester.geohash.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lester.geohash.entity.Country;

@Service
public class ReportService {
    @Autowired
    private CountryService countryService;
    public void generateCountryReport() throws IOException {
        List<Country> countries = countryService.findAll();

        try (XWPFDocument document = new XWPFDocument()) {
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText("Country Report");

            for (Country country : countries) {
                XWPFParagraph countryParagraph = document.createParagraph();
                XWPFRun countryRun = countryParagraph.createRun();
                countryRun.setText(country.getName());
            }

            try (FileOutputStream out = new FileOutputStream("CountryReport.docx")) {
                document.write(out);
            }
        }
    }
    
    // Similar methods for other reports...
}
