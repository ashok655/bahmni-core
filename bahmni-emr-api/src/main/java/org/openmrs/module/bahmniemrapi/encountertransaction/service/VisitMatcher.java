package org.openmrs.module.bahmniemrapi.encountertransaction.service;

import org.openmrs.Patient;
import org.openmrs.Visit;
import org.openmrs.VisitType;
import org.openmrs.module.bahmniemrapi.encountertransaction.contract.BahmniEncounterTransaction;

import java.util.Date;

public interface VisitMatcher {
    Visit getVisitFor(Patient patient, String visitTypeForNewVisit, Date orderDate, Date visitStartDate, Date visitEndDate, String locationUuid);
    Visit getVisitFor(Patient patient, String visitTypeForNewVisit, Date orderDate);
    boolean hasActiveVisit(Patient patient);
    Visit createNewVisit(Patient patient, Date date, String visitTypeForNewVisit, Date visitStartDate, Date visitEndDate, String locationUuid);
    VisitType getVisitTypeByName(String visitTypeName);
    void createOrStretchVisit(BahmniEncounterTransaction bahmniEncounterTransaction, Patient patient, Date visitStartDate, Date visitEndDate);
}