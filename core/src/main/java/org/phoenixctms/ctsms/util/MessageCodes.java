package org.phoenixctms.ctsms.util;

public interface MessageCodes {

	public static final String PROPERTY_NOT_FOUND_OR_INVALID_TYPE = "property_not_found_or_invalid_type";
	public static final String CRITERIA_PROPERTY_TYPE_NOT_SUPPORTED = "criteria_property_type_not_supported";
	public static final String NAMED_PARAMETER_UNKNOWN_USER = "named_parameter_unknown_user";
	public static final String NAMED_PARAMETER_UNKNOWN_USER_DEPARTMENT = "named_parameter_unknown_user_department";
	public static final String NAMED_PARAMETER_UNKNOWN_IDENTITY = "named_parameter_unknown_identity";
	public static final String NAMED_PARAMETER_UNKNOWN_IDENTITY_DEPARTMENT = "named_parameter_unknown_identity_department";
	public static final String NAMED_PARAMETER_EXPLICIT_VARIABLE_PERIOD = "named_parameter_explicit_variable_period";
	public static final String UNSUPPORTED_DB_MODULE = "unsupported_db_module";
	public static final String SQL_SET_OPERATION_KEYWORD_UNDEFINED = "sql_set_operation_keyword_undefined";
	public static final String UNBALANCED_SET_PARENTHESES = "unbalanced_set_parentheses";
	public static final String UNSUPPORTED_CRITERION_TIE = "unsupported_criterion_tie";
	public static final String UNSUPPORTED_CRITERION_RESTRICTION = "unsupported_criterion_restriction";
	public static final String INVALID_PROPERTY_ASSOCIATION_PATH = "invalid_property_association_path";
	public static final String NO_CRITERIA_FOR_ASSOCIATION_PATH = "no_criteria_for_association_path";
	public final static String CRITERION_NOT_IMPLEMENTED_SYNTAX_ERROR = "criterion_not_implemented_syntax_error";
	public final static String CRITERION_CLASS_NOT_SUPPORTED = "criterion_class_not_supported";
	public final static String UNSUPPORTED_VARIABLE_PERIOD = "unsupported_variable_period";
	public final static String EASTER_DATE_YEAR_UNSUPPORTED = "easter_date_year_unsupported";
	public final static String UNSUPPORTED_WEEKDAY = "unsupported_weekday";
	public final static String HOLIDAY_MONTH_UNDEFINED = "holiday_month_undefined";
	public final static String HOLIDAY_DAY_UNDEFINED = "holiday_day_undefined";
	public final static String HOLIDAY_WEEKDAY_UNDEFINED = "holiday_weekday_undefined";
	public final static String HOLIDAY_N_UNDEFINED = "holiday_n_undefined";
	public final static String UNSUPPORTED_HOLIDAY_BASE_DATE = "unsupported_holiday_base_date";
	public final static String INVALID_DATE_INTERVAL = "invalid_date_interval";
	public final static String INVALID_TIME_ZONE = "invalid_time_zone";
	public final static String INVALID_LOCALE = "invalid_locale";
	public final static String EXTERNAL_FILE_DATADIR_ACCESS_ERROR = "external_file_datadir_access_error";
	public final static String EXTERNAL_FILE_DATADIR_NOT_ABSOLUTE_ERROR = "external_file_datadir_not_absolute_error";
	public final static String EXTERNAL_FILE_DATADIR_CREATION_ERROR = "external_file_datadir_creation_error";
	public final static String EXTERNAL_FILE_DATADIR_NOTADIR_ERROR = "external_file_datadir_notadir_error";
	public final static String PDF_TEMPLATE_FILE_ACCESS_ERROR = "pdf_template_file_access_error";
	public final static String PDF_TEMPLATE_FILE_NOTAFILE_ERROR = "pdf_template_file_notafile_error";
	public final static String PDF_TEMPLATE_FILE_DOES_NOT_EXIST_ERROR = "pdf_template_file_does_not_exist_error";
	public final static String PDF_TEMPLATE_FILE_INVALID_PDF_ERROR = "pdf_template_file_invalid_pdf_error";
	public final static String JS_FILE_ACCESS_ERROR = "js_file_access_error";
	public final static String JS_FILE_NOTAFILE_ERROR = "js_file_notafile_error";
	public final static String JS_FILE_DOES_NOT_EXIST_ERROR = "js_file_does_not_exist_error";
	public final static String JS_FILE_SCRIPT_ERROR = "js_file_script_error";
	public final static String TTF_INVALID_TTF_ERROR = "ttf_invalid_ttf_error";
	public final static String TTF_FILE_ACCESS_ERROR = "ttf_file_access_error";
	public final static String TTF_NOTAFILE_ERROR = "ttf_notafile_error";
	public final static String TTF_FILE_DOES_NOT_EXIST_ERROR = "ttf_file_does_not_exist_error";
	public final static String IMAGE_FILE_ACCESS_ERROR = "image_file_access_error";
	public final static String IMAGE_FILE_NOTAFILE_ERROR = "image_file_notafile_error";
	public final static String IMAGE_FILE_DOES_NOT_EXIST_ERROR = "image_file_does_not_exist_error";
	public final static String IMAGE_FILE_INVALID_IMAGE_ERROR = "image_file_invalid_image_error";
	public final static String TRUE = "true";
	public final static String FALSE = "false";
	public final static String ENCRYPTED_PROBAND_NAME = "encrypted_proband_name";
	public final static String NEW_BLINDED_PROBAND_NAME = "new_blinded_proband_name";
	public final static String BLINDED_PROBAND_NAME = "blinded_proband_name";
	public final static String ENCRYPTED_PROBAND_ADDRESS = "encrypted_proband_address";
	public final static String ENCRYPTED_BANK_ACCOUNT_NAME = "encrypted_bank_account_name";
	public final static String PASSWORD_SMALL_LETTERS = "password_small_letters";
	public final static String PASSWORD_CAPITAL_LETTERS = "password_capital_letters";
	public final static String PASSWORD_DIGITS = "password_digits";
	public final static String PASSWORD_UMLAUTS = "password_umlauts";
	public final static String PASSWORD_WHITESPACES = "password_whitespaces";
	public final static String PASSWORD_ALT_SYMBOLS = "password_alt_symbols";
	public final static String PASSWORD_SYMBOLS = "password_symbols";
	public final static String PASSWORD_TOO_SHORT = "password_too_short";
	public final static String PASSWORD_TOO_LONG = "password_too_long";
	public final static String PASSWORD_TOO_FEW_OCCURRENCES = "password_too_few_occurrences";
	public final static String PASSWORD_TOO_MANY_OCCURRENCES = "password_too_many_occurrences";
	public final static String PASSWORD_INVALID_CHAR_FOUND = "password_invalid_char_found";
	public final static String PASSWORD_TOO_SIMILAR_TO_PREVIOUS_PASSWORDS = "password_too_similar_to_previous_passwords";
	public final static String PASSWORD_MIN_LENGTH_REQUIREMENT = "password_min_length_requirement";
	public final static String PASSWORD_MAX_LENGTH_REQUIREMENT = "password_max_length_requirement";
	public final static String PASSWORD_CHARACTER_CLASS_MIN_REQUIREMENT = "password_character_class_min_requirement";
	public final static String PASSWORD_CHARACTER_CLASS_MAX_REQUIREMENT = "password_character_class_max_requirement";
	public final static String PASSWORD_COMPLETE_PASSWORD_HISTORY_REQUIREMENT = "password_complete_password_history_requirement";
	public final static String PASSWORD_DISTANCE_PASSWORD_HISTORY_REQUIREMENT = "password_distance_password_history_requirement";
	public final static String PASSWORD_ADMIN_IGNORE_POLICY_REQUIREMENT = "password_admin_ignore_policy";
	public final static String PASSWORD_INVALID_LENGTH_DEF = "password_invalid_length_def";
	public final static String PASSWORD_INVALID_CHARSET_OCCURRENCE_DEF = "password_invalid_charset_occurrence_def";
	public final static String PASSWORD_CHAR_MIN_OCCURRENCES_SANITY_ERROR = "password_char_min_occurrences_sanity_error";
	public final static String PASSWORD_CHAR_MAX_OCCURRENCES_SANITY_ERROR = "password_char_max_occurrences_sanity_error";
	public final static String PBE_PASSWORD_ZERO_LENGTH_ERROR = "pbe_password_zero_length_error";
	public final static String REMINDER_ENTITY_NOT_SUPPORTED = "reminder_entity_not_supported";
	public final static String UNSUPPORTED_FILE_MODULE = "unsupported_file_module";
	public final static String UNSUPPORTED_HYPERLINK_MODULE = "unsupported_hyperlink_module";
	public final static String UNSUPPORTED_JOURNAL_MODULE = "unsupported_journal_module";
	public final static String UNSUPPORTED_INPUT_FIELD_TYPE = "unsupported_input_field_type";
	public final static String UNSUPPORTED_PICKER_DB_MODULE = "unsupported_picker_db_module";
	public static final String UNSUPPORTED_SERVICE_METHOD_PARAMETER_RESTRICTION = "unsupported_service_method_parameter_restriction";
	public static final String UNSUPPORTED_SERVICE_METHOD_PARAMETER_TRANSFORMATION = "unsupported_service_method_parameter_transformation";
	public static final String UNSUPPORTED_SERVICE_METHOD_PARAMETER_OVERRIDE = "unsupported_service_method_parameter_override";
	public static final String UNSUPPORTED_AUTHENTICATION_TYPE = "unsupported_authentication_type";
	public static final String UNKNOWN_LDAP_SERVICE = "unknown_ldap_service";
	public static final String MD5_CHECK_FAILED = "md5_check_failed";
	public static final String NO_DECRYPTABLE_PDF_FILES = "no_decryptable_pdf_files";
	public static final String INTERVAL_STOP_BEFORE_START = "interval_stop_before_start";
	public static final String DIFFERRING_ORIGINAL_AND_UPDATED_VO_TYPES = "differring_original_and_updated_vo_types";
	public static final String UNSUPPORTED_ENUMERATION_OR_VALUE = "unsupported_enumeration_or_value";
	public static final String UNSUPPORTED_ENTITY = "unsupported_entity";
	public static final String UNSUPPORTED_MAIL_RECIPIENT_ENTITY = "unsupported_mail_recipient_entity";
	public static final String UNSUPPORTED_MAIL_RECIPIENT_PROPERTY = "unsupported_mail_recipient_property";
	public static final String SIGNEE_IDENTITY_LABEL = "signee_identity_label";
	public static final String TRIAL_SIGNATURE_VALID_DESCRIPTION = "trial_signature_valid_description";
	public static final String TRIAL_SIGNATURE_INVALID_DESCRIPTION = "trial_signature_invalid_description";
	public static final String TRIAL_SIGNATURE_AVAILABLE = "trial_signature_available";
	public static final String ECRF_SIGNATURE_VALID_DESCRIPTION = "ecrf_signature_valid_description";
	public static final String ECRF_SIGNATURE_INVALID_DESCRIPTION = "ecrf_signature_invalid_description";
	public static final String ECRF_SIGNATURE_AVAILABLE = "ecrf_signature_available";
	public static final String UNSUPPORTED_RANDOMIZATION_MODE = "unsupported_randomization_mode";
	public static final String UNSUPPORTED_RANDOMIZATION_TYPE = "unsupported_randomization_type";
	public static final String ECRF_VALIDATION_FAILED_RESPONSE = "ecrf_validation_failed_response";
	public static final String ECRF_VALIDATION_OK_ERRORS_RESPONSE = "ecrf_validation_ok_errors_response";
	public static final String ECRF_VALIDATION_OK_NO_ERROR_RESPONSE = "ecrf_validation_ok_no_error_response";
	public static final String NOTIFICATION_INPUT_FIELD_VALUE_CHECKBOX_CHECKED = "notification_input_field_value_checkbox_checked";
	public static final String NOTIFICATION_INPUT_FIELD_VALUE_CHECKBOX_UNCHECKED = "notification_input_field_value_checkbox_unchecked";
	public static final String MASS_MAIL_INPUT_FIELD_VALUE_CHECKBOX_CHECKED = "mass_mail_input_field_value_checkbox_checked";
	public static final String MASS_MAIL_INPUT_FIELD_VALUE_CHECKBOX_UNCHECKED = "mail_mail_input_field_value_checkbox_unchecked";
	public static final String MASS_MAIL_CACNELLED_NO_RECIPIENTS = "mass_mail_cacnelled_no_recipients";
	public static final String UNSUPPORTED_JOB_MODULE = "unsupported_job_module";
	public static final String START_JOB_ERROR = "start_job_error";
	public static final String LOOP_PATH_SEPARATOR = "loop_path_separator";
	public static final String LOOP_PATH_COURSE_LABEL = "loop_path_course_label";
	public static final String LOOP_PATH_INVENTORY_LABEL = "loop_path_inventory_label";
	public static final String LOOP_PATH_PROBAND_LABEL = "loop_path_proband_label";
	public static final String LOOP_PATH_STAFF_LABEL = "loop_path_staff_label";
	public static final String LOOP_PATH_TIMELINE_EVENT_LABEL = "loop_path_timeline_event_label";
}