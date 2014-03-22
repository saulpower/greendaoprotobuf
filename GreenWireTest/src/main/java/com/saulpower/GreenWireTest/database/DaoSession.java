package com.saulpower.GreenWireTest.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.saulpower.GreenWireTest.database.SaveResult;
import com.saulpower.GreenWireTest.database.CustomValue;
import com.saulpower.GreenWireTest.database.PhoneNumber;
import com.saulpower.GreenWireTest.database.OUType;
import com.saulpower.GreenWireTest.database.Address;
import com.saulpower.GreenWireTest.database.EmploymentRole;
import com.saulpower.GreenWireTest.database.EmploymentStatus;
import com.saulpower.GreenWireTest.database.Department;
import com.saulpower.GreenWireTest.database.PayrollDefinition;
import com.saulpower.GreenWireTest.database.EmployeeFile;
import com.saulpower.GreenWireTest.database.PayPeriod;
import com.saulpower.GreenWireTest.database.ApplicationSource;
import com.saulpower.GreenWireTest.database.LedgerGroup;
import com.saulpower.GreenWireTest.database.Attachment;
import com.saulpower.GreenWireTest.database.PersonalRelationship;
import com.saulpower.GreenWireTest.database.Note;
import com.saulpower.GreenWireTest.database.PickupAuthorization;
import com.saulpower.GreenWireTest.database.Identification;
import com.saulpower.GreenWireTest.database.Allergy;
import com.saulpower.GreenWireTest.database.ImmunizationSchedule;
import com.saulpower.GreenWireTest.database.ImmunizationDefinition;
import com.saulpower.GreenWireTest.database.Immunization;
import com.saulpower.GreenWireTest.database.JournalEntryComment;
import com.saulpower.GreenWireTest.database.JournalEntry;
import com.saulpower.GreenWireTest.database.Vehicle;
import com.saulpower.GreenWireTest.database.ValueListItem;
import com.saulpower.GreenWireTest.database.CustomField;
import com.saulpower.GreenWireTest.database.RoleBase;
import com.saulpower.GreenWireTest.database.OUBase;
import com.saulpower.GreenWireTest.database.Device;
import com.saulpower.GreenWireTest.database.AuthorizedPerson;
import com.saulpower.GreenWireTest.database.Association;
import com.saulpower.GreenWireTest.database.Person;
import com.saulpower.GreenWireTest.database.LedgerItem;
import com.saulpower.GreenWireTest.database.LedgerAccount;
import com.saulpower.GreenWireTest.database.Holiday;
import com.saulpower.GreenWireTest.database.OU;
import com.saulpower.GreenWireTest.database.School;
import com.saulpower.GreenWireTest.database.CheckIn;
import com.saulpower.GreenWireTest.database.CheckOut;
import com.saulpower.GreenWireTest.database.WithdrawalCode;
import com.saulpower.GreenWireTest.database.SecurityQuestion;
import com.saulpower.GreenWireTest.database.Family;
import com.saulpower.GreenWireTest.database.MedicalProvider;
import com.saulpower.GreenWireTest.database.Activity;
import com.saulpower.GreenWireTest.database.Clasz;
import com.saulpower.GreenWireTest.database.ClassAssignment;
import com.saulpower.GreenWireTest.database.Student;

import com.saulpower.GreenWireTest.database.SaveResultDao;
import com.saulpower.GreenWireTest.database.CustomValueDao;
import com.saulpower.GreenWireTest.database.PhoneNumberDao;
import com.saulpower.GreenWireTest.database.OUTypeDao;
import com.saulpower.GreenWireTest.database.AddressDao;
import com.saulpower.GreenWireTest.database.EmploymentRoleDao;
import com.saulpower.GreenWireTest.database.EmploymentStatusDao;
import com.saulpower.GreenWireTest.database.DepartmentDao;
import com.saulpower.GreenWireTest.database.PayrollDefinitionDao;
import com.saulpower.GreenWireTest.database.EmployeeFileDao;
import com.saulpower.GreenWireTest.database.PayPeriodDao;
import com.saulpower.GreenWireTest.database.ApplicationSourceDao;
import com.saulpower.GreenWireTest.database.LedgerGroupDao;
import com.saulpower.GreenWireTest.database.AttachmentDao;
import com.saulpower.GreenWireTest.database.PersonalRelationshipDao;
import com.saulpower.GreenWireTest.database.NoteDao;
import com.saulpower.GreenWireTest.database.PickupAuthorizationDao;
import com.saulpower.GreenWireTest.database.IdentificationDao;
import com.saulpower.GreenWireTest.database.AllergyDao;
import com.saulpower.GreenWireTest.database.ImmunizationScheduleDao;
import com.saulpower.GreenWireTest.database.ImmunizationDefinitionDao;
import com.saulpower.GreenWireTest.database.ImmunizationDao;
import com.saulpower.GreenWireTest.database.JournalEntryCommentDao;
import com.saulpower.GreenWireTest.database.JournalEntryDao;
import com.saulpower.GreenWireTest.database.VehicleDao;
import com.saulpower.GreenWireTest.database.ValueListItemDao;
import com.saulpower.GreenWireTest.database.CustomFieldDao;
import com.saulpower.GreenWireTest.database.RoleBaseDao;
import com.saulpower.GreenWireTest.database.OUBaseDao;
import com.saulpower.GreenWireTest.database.DeviceDao;
import com.saulpower.GreenWireTest.database.AuthorizedPersonDao;
import com.saulpower.GreenWireTest.database.AssociationDao;
import com.saulpower.GreenWireTest.database.PersonDao;
import com.saulpower.GreenWireTest.database.LedgerItemDao;
import com.saulpower.GreenWireTest.database.LedgerAccountDao;
import com.saulpower.GreenWireTest.database.HolidayDao;
import com.saulpower.GreenWireTest.database.OUDao;
import com.saulpower.GreenWireTest.database.SchoolDao;
import com.saulpower.GreenWireTest.database.CheckInDao;
import com.saulpower.GreenWireTest.database.CheckOutDao;
import com.saulpower.GreenWireTest.database.WithdrawalCodeDao;
import com.saulpower.GreenWireTest.database.SecurityQuestionDao;
import com.saulpower.GreenWireTest.database.FamilyDao;
import com.saulpower.GreenWireTest.database.MedicalProviderDao;
import com.saulpower.GreenWireTest.database.ActivityDao;
import com.saulpower.GreenWireTest.database.ClaszDao;
import com.saulpower.GreenWireTest.database.ClassAssignmentDao;
import com.saulpower.GreenWireTest.database.StudentDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig saveResultDaoConfig;
    private final DaoConfig customValueDaoConfig;
    private final DaoConfig phoneNumberDaoConfig;
    private final DaoConfig oUTypeDaoConfig;
    private final DaoConfig addressDaoConfig;
    private final DaoConfig employmentRoleDaoConfig;
    private final DaoConfig employmentStatusDaoConfig;
    private final DaoConfig departmentDaoConfig;
    private final DaoConfig payrollDefinitionDaoConfig;
    private final DaoConfig employeeFileDaoConfig;
    private final DaoConfig payPeriodDaoConfig;
    private final DaoConfig applicationSourceDaoConfig;
    private final DaoConfig ledgerGroupDaoConfig;
    private final DaoConfig attachmentDaoConfig;
    private final DaoConfig personalRelationshipDaoConfig;
    private final DaoConfig noteDaoConfig;
    private final DaoConfig pickupAuthorizationDaoConfig;
    private final DaoConfig identificationDaoConfig;
    private final DaoConfig allergyDaoConfig;
    private final DaoConfig immunizationScheduleDaoConfig;
    private final DaoConfig immunizationDefinitionDaoConfig;
    private final DaoConfig immunizationDaoConfig;
    private final DaoConfig journalEntryCommentDaoConfig;
    private final DaoConfig journalEntryDaoConfig;
    private final DaoConfig vehicleDaoConfig;
    private final DaoConfig valueListItemDaoConfig;
    private final DaoConfig customFieldDaoConfig;
    private final DaoConfig roleBaseDaoConfig;
    private final DaoConfig oUBaseDaoConfig;
    private final DaoConfig deviceDaoConfig;
    private final DaoConfig authorizedPersonDaoConfig;
    private final DaoConfig associationDaoConfig;
    private final DaoConfig personDaoConfig;
    private final DaoConfig ledgerItemDaoConfig;
    private final DaoConfig ledgerAccountDaoConfig;
    private final DaoConfig holidayDaoConfig;
    private final DaoConfig oUDaoConfig;
    private final DaoConfig schoolDaoConfig;
    private final DaoConfig checkInDaoConfig;
    private final DaoConfig checkOutDaoConfig;
    private final DaoConfig withdrawalCodeDaoConfig;
    private final DaoConfig securityQuestionDaoConfig;
    private final DaoConfig familyDaoConfig;
    private final DaoConfig medicalProviderDaoConfig;
    private final DaoConfig activityDaoConfig;
    private final DaoConfig claszDaoConfig;
    private final DaoConfig classAssignmentDaoConfig;
    private final DaoConfig studentDaoConfig;

    private final SaveResultDao saveResultDao;
    private final CustomValueDao customValueDao;
    private final PhoneNumberDao phoneNumberDao;
    private final OUTypeDao oUTypeDao;
    private final AddressDao addressDao;
    private final EmploymentRoleDao employmentRoleDao;
    private final EmploymentStatusDao employmentStatusDao;
    private final DepartmentDao departmentDao;
    private final PayrollDefinitionDao payrollDefinitionDao;
    private final EmployeeFileDao employeeFileDao;
    private final PayPeriodDao payPeriodDao;
    private final ApplicationSourceDao applicationSourceDao;
    private final LedgerGroupDao ledgerGroupDao;
    private final AttachmentDao attachmentDao;
    private final PersonalRelationshipDao personalRelationshipDao;
    private final NoteDao noteDao;
    private final PickupAuthorizationDao pickupAuthorizationDao;
    private final IdentificationDao identificationDao;
    private final AllergyDao allergyDao;
    private final ImmunizationScheduleDao immunizationScheduleDao;
    private final ImmunizationDefinitionDao immunizationDefinitionDao;
    private final ImmunizationDao immunizationDao;
    private final JournalEntryCommentDao journalEntryCommentDao;
    private final JournalEntryDao journalEntryDao;
    private final VehicleDao vehicleDao;
    private final ValueListItemDao valueListItemDao;
    private final CustomFieldDao customFieldDao;
    private final RoleBaseDao roleBaseDao;
    private final OUBaseDao oUBaseDao;
    private final DeviceDao deviceDao;
    private final AuthorizedPersonDao authorizedPersonDao;
    private final AssociationDao associationDao;
    private final PersonDao personDao;
    private final LedgerItemDao ledgerItemDao;
    private final LedgerAccountDao ledgerAccountDao;
    private final HolidayDao holidayDao;
    private final OUDao oUDao;
    private final SchoolDao schoolDao;
    private final CheckInDao checkInDao;
    private final CheckOutDao checkOutDao;
    private final WithdrawalCodeDao withdrawalCodeDao;
    private final SecurityQuestionDao securityQuestionDao;
    private final FamilyDao familyDao;
    private final MedicalProviderDao medicalProviderDao;
    private final ActivityDao activityDao;
    private final ClaszDao claszDao;
    private final ClassAssignmentDao classAssignmentDao;
    private final StudentDao studentDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        saveResultDaoConfig = daoConfigMap.get(SaveResultDao.class).clone();
        saveResultDaoConfig.initIdentityScope(type);

        customValueDaoConfig = daoConfigMap.get(CustomValueDao.class).clone();
        customValueDaoConfig.initIdentityScope(type);

        phoneNumberDaoConfig = daoConfigMap.get(PhoneNumberDao.class).clone();
        phoneNumberDaoConfig.initIdentityScope(type);

        oUTypeDaoConfig = daoConfigMap.get(OUTypeDao.class).clone();
        oUTypeDaoConfig.initIdentityScope(type);

        addressDaoConfig = daoConfigMap.get(AddressDao.class).clone();
        addressDaoConfig.initIdentityScope(type);

        employmentRoleDaoConfig = daoConfigMap.get(EmploymentRoleDao.class).clone();
        employmentRoleDaoConfig.initIdentityScope(type);

        employmentStatusDaoConfig = daoConfigMap.get(EmploymentStatusDao.class).clone();
        employmentStatusDaoConfig.initIdentityScope(type);

        departmentDaoConfig = daoConfigMap.get(DepartmentDao.class).clone();
        departmentDaoConfig.initIdentityScope(type);

        payrollDefinitionDaoConfig = daoConfigMap.get(PayrollDefinitionDao.class).clone();
        payrollDefinitionDaoConfig.initIdentityScope(type);

        employeeFileDaoConfig = daoConfigMap.get(EmployeeFileDao.class).clone();
        employeeFileDaoConfig.initIdentityScope(type);

        payPeriodDaoConfig = daoConfigMap.get(PayPeriodDao.class).clone();
        payPeriodDaoConfig.initIdentityScope(type);

        applicationSourceDaoConfig = daoConfigMap.get(ApplicationSourceDao.class).clone();
        applicationSourceDaoConfig.initIdentityScope(type);

        ledgerGroupDaoConfig = daoConfigMap.get(LedgerGroupDao.class).clone();
        ledgerGroupDaoConfig.initIdentityScope(type);

        attachmentDaoConfig = daoConfigMap.get(AttachmentDao.class).clone();
        attachmentDaoConfig.initIdentityScope(type);

        personalRelationshipDaoConfig = daoConfigMap.get(PersonalRelationshipDao.class).clone();
        personalRelationshipDaoConfig.initIdentityScope(type);

        noteDaoConfig = daoConfigMap.get(NoteDao.class).clone();
        noteDaoConfig.initIdentityScope(type);

        pickupAuthorizationDaoConfig = daoConfigMap.get(PickupAuthorizationDao.class).clone();
        pickupAuthorizationDaoConfig.initIdentityScope(type);

        identificationDaoConfig = daoConfigMap.get(IdentificationDao.class).clone();
        identificationDaoConfig.initIdentityScope(type);

        allergyDaoConfig = daoConfigMap.get(AllergyDao.class).clone();
        allergyDaoConfig.initIdentityScope(type);

        immunizationScheduleDaoConfig = daoConfigMap.get(ImmunizationScheduleDao.class).clone();
        immunizationScheduleDaoConfig.initIdentityScope(type);

        immunizationDefinitionDaoConfig = daoConfigMap.get(ImmunizationDefinitionDao.class).clone();
        immunizationDefinitionDaoConfig.initIdentityScope(type);

        immunizationDaoConfig = daoConfigMap.get(ImmunizationDao.class).clone();
        immunizationDaoConfig.initIdentityScope(type);

        journalEntryCommentDaoConfig = daoConfigMap.get(JournalEntryCommentDao.class).clone();
        journalEntryCommentDaoConfig.initIdentityScope(type);

        journalEntryDaoConfig = daoConfigMap.get(JournalEntryDao.class).clone();
        journalEntryDaoConfig.initIdentityScope(type);

        vehicleDaoConfig = daoConfigMap.get(VehicleDao.class).clone();
        vehicleDaoConfig.initIdentityScope(type);

        valueListItemDaoConfig = daoConfigMap.get(ValueListItemDao.class).clone();
        valueListItemDaoConfig.initIdentityScope(type);

        customFieldDaoConfig = daoConfigMap.get(CustomFieldDao.class).clone();
        customFieldDaoConfig.initIdentityScope(type);

        roleBaseDaoConfig = daoConfigMap.get(RoleBaseDao.class).clone();
        roleBaseDaoConfig.initIdentityScope(type);

        oUBaseDaoConfig = daoConfigMap.get(OUBaseDao.class).clone();
        oUBaseDaoConfig.initIdentityScope(type);

        deviceDaoConfig = daoConfigMap.get(DeviceDao.class).clone();
        deviceDaoConfig.initIdentityScope(type);

        authorizedPersonDaoConfig = daoConfigMap.get(AuthorizedPersonDao.class).clone();
        authorizedPersonDaoConfig.initIdentityScope(type);

        associationDaoConfig = daoConfigMap.get(AssociationDao.class).clone();
        associationDaoConfig.initIdentityScope(type);

        personDaoConfig = daoConfigMap.get(PersonDao.class).clone();
        personDaoConfig.initIdentityScope(type);

        ledgerItemDaoConfig = daoConfigMap.get(LedgerItemDao.class).clone();
        ledgerItemDaoConfig.initIdentityScope(type);

        ledgerAccountDaoConfig = daoConfigMap.get(LedgerAccountDao.class).clone();
        ledgerAccountDaoConfig.initIdentityScope(type);

        holidayDaoConfig = daoConfigMap.get(HolidayDao.class).clone();
        holidayDaoConfig.initIdentityScope(type);

        oUDaoConfig = daoConfigMap.get(OUDao.class).clone();
        oUDaoConfig.initIdentityScope(type);

        schoolDaoConfig = daoConfigMap.get(SchoolDao.class).clone();
        schoolDaoConfig.initIdentityScope(type);

        checkInDaoConfig = daoConfigMap.get(CheckInDao.class).clone();
        checkInDaoConfig.initIdentityScope(type);

        checkOutDaoConfig = daoConfigMap.get(CheckOutDao.class).clone();
        checkOutDaoConfig.initIdentityScope(type);

        withdrawalCodeDaoConfig = daoConfigMap.get(WithdrawalCodeDao.class).clone();
        withdrawalCodeDaoConfig.initIdentityScope(type);

        securityQuestionDaoConfig = daoConfigMap.get(SecurityQuestionDao.class).clone();
        securityQuestionDaoConfig.initIdentityScope(type);

        familyDaoConfig = daoConfigMap.get(FamilyDao.class).clone();
        familyDaoConfig.initIdentityScope(type);

        medicalProviderDaoConfig = daoConfigMap.get(MedicalProviderDao.class).clone();
        medicalProviderDaoConfig.initIdentityScope(type);

        activityDaoConfig = daoConfigMap.get(ActivityDao.class).clone();
        activityDaoConfig.initIdentityScope(type);

        claszDaoConfig = daoConfigMap.get(ClaszDao.class).clone();
        claszDaoConfig.initIdentityScope(type);

        classAssignmentDaoConfig = daoConfigMap.get(ClassAssignmentDao.class).clone();
        classAssignmentDaoConfig.initIdentityScope(type);

        studentDaoConfig = daoConfigMap.get(StudentDao.class).clone();
        studentDaoConfig.initIdentityScope(type);

        saveResultDao = new SaveResultDao(saveResultDaoConfig, this);
        customValueDao = new CustomValueDao(customValueDaoConfig, this);
        phoneNumberDao = new PhoneNumberDao(phoneNumberDaoConfig, this);
        oUTypeDao = new OUTypeDao(oUTypeDaoConfig, this);
        addressDao = new AddressDao(addressDaoConfig, this);
        employmentRoleDao = new EmploymentRoleDao(employmentRoleDaoConfig, this);
        employmentStatusDao = new EmploymentStatusDao(employmentStatusDaoConfig, this);
        departmentDao = new DepartmentDao(departmentDaoConfig, this);
        payrollDefinitionDao = new PayrollDefinitionDao(payrollDefinitionDaoConfig, this);
        employeeFileDao = new EmployeeFileDao(employeeFileDaoConfig, this);
        payPeriodDao = new PayPeriodDao(payPeriodDaoConfig, this);
        applicationSourceDao = new ApplicationSourceDao(applicationSourceDaoConfig, this);
        ledgerGroupDao = new LedgerGroupDao(ledgerGroupDaoConfig, this);
        attachmentDao = new AttachmentDao(attachmentDaoConfig, this);
        personalRelationshipDao = new PersonalRelationshipDao(personalRelationshipDaoConfig, this);
        noteDao = new NoteDao(noteDaoConfig, this);
        pickupAuthorizationDao = new PickupAuthorizationDao(pickupAuthorizationDaoConfig, this);
        identificationDao = new IdentificationDao(identificationDaoConfig, this);
        allergyDao = new AllergyDao(allergyDaoConfig, this);
        immunizationScheduleDao = new ImmunizationScheduleDao(immunizationScheduleDaoConfig, this);
        immunizationDefinitionDao = new ImmunizationDefinitionDao(immunizationDefinitionDaoConfig, this);
        immunizationDao = new ImmunizationDao(immunizationDaoConfig, this);
        journalEntryCommentDao = new JournalEntryCommentDao(journalEntryCommentDaoConfig, this);
        journalEntryDao = new JournalEntryDao(journalEntryDaoConfig, this);
        vehicleDao = new VehicleDao(vehicleDaoConfig, this);
        valueListItemDao = new ValueListItemDao(valueListItemDaoConfig, this);
        customFieldDao = new CustomFieldDao(customFieldDaoConfig, this);
        roleBaseDao = new RoleBaseDao(roleBaseDaoConfig, this);
        oUBaseDao = new OUBaseDao(oUBaseDaoConfig, this);
        deviceDao = new DeviceDao(deviceDaoConfig, this);
        authorizedPersonDao = new AuthorizedPersonDao(authorizedPersonDaoConfig, this);
        associationDao = new AssociationDao(associationDaoConfig, this);
        personDao = new PersonDao(personDaoConfig, this);
        ledgerItemDao = new LedgerItemDao(ledgerItemDaoConfig, this);
        ledgerAccountDao = new LedgerAccountDao(ledgerAccountDaoConfig, this);
        holidayDao = new HolidayDao(holidayDaoConfig, this);
        oUDao = new OUDao(oUDaoConfig, this);
        schoolDao = new SchoolDao(schoolDaoConfig, this);
        checkInDao = new CheckInDao(checkInDaoConfig, this);
        checkOutDao = new CheckOutDao(checkOutDaoConfig, this);
        withdrawalCodeDao = new WithdrawalCodeDao(withdrawalCodeDaoConfig, this);
        securityQuestionDao = new SecurityQuestionDao(securityQuestionDaoConfig, this);
        familyDao = new FamilyDao(familyDaoConfig, this);
        medicalProviderDao = new MedicalProviderDao(medicalProviderDaoConfig, this);
        activityDao = new ActivityDao(activityDaoConfig, this);
        claszDao = new ClaszDao(claszDaoConfig, this);
        classAssignmentDao = new ClassAssignmentDao(classAssignmentDaoConfig, this);
        studentDao = new StudentDao(studentDaoConfig, this);

        registerDao(SaveResult.class, saveResultDao);
        registerDao(CustomValue.class, customValueDao);
        registerDao(PhoneNumber.class, phoneNumberDao);
        registerDao(OUType.class, oUTypeDao);
        registerDao(Address.class, addressDao);
        registerDao(EmploymentRole.class, employmentRoleDao);
        registerDao(EmploymentStatus.class, employmentStatusDao);
        registerDao(Department.class, departmentDao);
        registerDao(PayrollDefinition.class, payrollDefinitionDao);
        registerDao(EmployeeFile.class, employeeFileDao);
        registerDao(PayPeriod.class, payPeriodDao);
        registerDao(ApplicationSource.class, applicationSourceDao);
        registerDao(LedgerGroup.class, ledgerGroupDao);
        registerDao(Attachment.class, attachmentDao);
        registerDao(PersonalRelationship.class, personalRelationshipDao);
        registerDao(Note.class, noteDao);
        registerDao(PickupAuthorization.class, pickupAuthorizationDao);
        registerDao(Identification.class, identificationDao);
        registerDao(Allergy.class, allergyDao);
        registerDao(ImmunizationSchedule.class, immunizationScheduleDao);
        registerDao(ImmunizationDefinition.class, immunizationDefinitionDao);
        registerDao(Immunization.class, immunizationDao);
        registerDao(JournalEntryComment.class, journalEntryCommentDao);
        registerDao(JournalEntry.class, journalEntryDao);
        registerDao(Vehicle.class, vehicleDao);
        registerDao(ValueListItem.class, valueListItemDao);
        registerDao(CustomField.class, customFieldDao);
        registerDao(RoleBase.class, roleBaseDao);
        registerDao(OUBase.class, oUBaseDao);
        registerDao(Device.class, deviceDao);
        registerDao(AuthorizedPerson.class, authorizedPersonDao);
        registerDao(Association.class, associationDao);
        registerDao(Person.class, personDao);
        registerDao(LedgerItem.class, ledgerItemDao);
        registerDao(LedgerAccount.class, ledgerAccountDao);
        registerDao(Holiday.class, holidayDao);
        registerDao(OU.class, oUDao);
        registerDao(School.class, schoolDao);
        registerDao(CheckIn.class, checkInDao);
        registerDao(CheckOut.class, checkOutDao);
        registerDao(WithdrawalCode.class, withdrawalCodeDao);
        registerDao(SecurityQuestion.class, securityQuestionDao);
        registerDao(Family.class, familyDao);
        registerDao(MedicalProvider.class, medicalProviderDao);
        registerDao(Activity.class, activityDao);
        registerDao(Clasz.class, claszDao);
        registerDao(ClassAssignment.class, classAssignmentDao);
        registerDao(Student.class, studentDao);
    }
    
    public void clear() {
        saveResultDaoConfig.getIdentityScope().clear();
        customValueDaoConfig.getIdentityScope().clear();
        phoneNumberDaoConfig.getIdentityScope().clear();
        oUTypeDaoConfig.getIdentityScope().clear();
        addressDaoConfig.getIdentityScope().clear();
        employmentRoleDaoConfig.getIdentityScope().clear();
        employmentStatusDaoConfig.getIdentityScope().clear();
        departmentDaoConfig.getIdentityScope().clear();
        payrollDefinitionDaoConfig.getIdentityScope().clear();
        employeeFileDaoConfig.getIdentityScope().clear();
        payPeriodDaoConfig.getIdentityScope().clear();
        applicationSourceDaoConfig.getIdentityScope().clear();
        ledgerGroupDaoConfig.getIdentityScope().clear();
        attachmentDaoConfig.getIdentityScope().clear();
        personalRelationshipDaoConfig.getIdentityScope().clear();
        noteDaoConfig.getIdentityScope().clear();
        pickupAuthorizationDaoConfig.getIdentityScope().clear();
        identificationDaoConfig.getIdentityScope().clear();
        allergyDaoConfig.getIdentityScope().clear();
        immunizationScheduleDaoConfig.getIdentityScope().clear();
        immunizationDefinitionDaoConfig.getIdentityScope().clear();
        immunizationDaoConfig.getIdentityScope().clear();
        journalEntryCommentDaoConfig.getIdentityScope().clear();
        journalEntryDaoConfig.getIdentityScope().clear();
        vehicleDaoConfig.getIdentityScope().clear();
        valueListItemDaoConfig.getIdentityScope().clear();
        customFieldDaoConfig.getIdentityScope().clear();
        roleBaseDaoConfig.getIdentityScope().clear();
        oUBaseDaoConfig.getIdentityScope().clear();
        deviceDaoConfig.getIdentityScope().clear();
        authorizedPersonDaoConfig.getIdentityScope().clear();
        associationDaoConfig.getIdentityScope().clear();
        personDaoConfig.getIdentityScope().clear();
        ledgerItemDaoConfig.getIdentityScope().clear();
        ledgerAccountDaoConfig.getIdentityScope().clear();
        holidayDaoConfig.getIdentityScope().clear();
        oUDaoConfig.getIdentityScope().clear();
        schoolDaoConfig.getIdentityScope().clear();
        checkInDaoConfig.getIdentityScope().clear();
        checkOutDaoConfig.getIdentityScope().clear();
        withdrawalCodeDaoConfig.getIdentityScope().clear();
        securityQuestionDaoConfig.getIdentityScope().clear();
        familyDaoConfig.getIdentityScope().clear();
        medicalProviderDaoConfig.getIdentityScope().clear();
        activityDaoConfig.getIdentityScope().clear();
        claszDaoConfig.getIdentityScope().clear();
        classAssignmentDaoConfig.getIdentityScope().clear();
        studentDaoConfig.getIdentityScope().clear();
    }

    public SaveResultDao getSaveResultDao() {
        return saveResultDao;
    }

    public CustomValueDao getCustomValueDao() {
        return customValueDao;
    }

    public PhoneNumberDao getPhoneNumberDao() {
        return phoneNumberDao;
    }

    public OUTypeDao getOUTypeDao() {
        return oUTypeDao;
    }

    public AddressDao getAddressDao() {
        return addressDao;
    }

    public EmploymentRoleDao getEmploymentRoleDao() {
        return employmentRoleDao;
    }

    public EmploymentStatusDao getEmploymentStatusDao() {
        return employmentStatusDao;
    }

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public PayrollDefinitionDao getPayrollDefinitionDao() {
        return payrollDefinitionDao;
    }

    public EmployeeFileDao getEmployeeFileDao() {
        return employeeFileDao;
    }

    public PayPeriodDao getPayPeriodDao() {
        return payPeriodDao;
    }

    public ApplicationSourceDao getApplicationSourceDao() {
        return applicationSourceDao;
    }

    public LedgerGroupDao getLedgerGroupDao() {
        return ledgerGroupDao;
    }

    public AttachmentDao getAttachmentDao() {
        return attachmentDao;
    }

    public PersonalRelationshipDao getPersonalRelationshipDao() {
        return personalRelationshipDao;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public PickupAuthorizationDao getPickupAuthorizationDao() {
        return pickupAuthorizationDao;
    }

    public IdentificationDao getIdentificationDao() {
        return identificationDao;
    }

    public AllergyDao getAllergyDao() {
        return allergyDao;
    }

    public ImmunizationScheduleDao getImmunizationScheduleDao() {
        return immunizationScheduleDao;
    }

    public ImmunizationDefinitionDao getImmunizationDefinitionDao() {
        return immunizationDefinitionDao;
    }

    public ImmunizationDao getImmunizationDao() {
        return immunizationDao;
    }

    public JournalEntryCommentDao getJournalEntryCommentDao() {
        return journalEntryCommentDao;
    }

    public JournalEntryDao getJournalEntryDao() {
        return journalEntryDao;
    }

    public VehicleDao getVehicleDao() {
        return vehicleDao;
    }

    public ValueListItemDao getValueListItemDao() {
        return valueListItemDao;
    }

    public CustomFieldDao getCustomFieldDao() {
        return customFieldDao;
    }

    public RoleBaseDao getRoleBaseDao() {
        return roleBaseDao;
    }

    public OUBaseDao getOUBaseDao() {
        return oUBaseDao;
    }

    public DeviceDao getDeviceDao() {
        return deviceDao;
    }

    public AuthorizedPersonDao getAuthorizedPersonDao() {
        return authorizedPersonDao;
    }

    public AssociationDao getAssociationDao() {
        return associationDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public LedgerItemDao getLedgerItemDao() {
        return ledgerItemDao;
    }

    public LedgerAccountDao getLedgerAccountDao() {
        return ledgerAccountDao;
    }

    public HolidayDao getHolidayDao() {
        return holidayDao;
    }

    public OUDao getOUDao() {
        return oUDao;
    }

    public SchoolDao getSchoolDao() {
        return schoolDao;
    }

    public CheckInDao getCheckInDao() {
        return checkInDao;
    }

    public CheckOutDao getCheckOutDao() {
        return checkOutDao;
    }

    public WithdrawalCodeDao getWithdrawalCodeDao() {
        return withdrawalCodeDao;
    }

    public SecurityQuestionDao getSecurityQuestionDao() {
        return securityQuestionDao;
    }

    public FamilyDao getFamilyDao() {
        return familyDao;
    }

    public MedicalProviderDao getMedicalProviderDao() {
        return medicalProviderDao;
    }

    public ActivityDao getActivityDao() {
        return activityDao;
    }

    public ClaszDao getClaszDao() {
        return claszDao;
    }

    public ClassAssignmentDao getClassAssignmentDao() {
        return classAssignmentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

}
