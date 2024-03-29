package com.example.mwt.util

// Constant for the shared pref file
const val SHARED_PREFERENCE_FILE = "com.constantin.pref"

// Unique worker name
const val UNIQUE_WORKER_NAME_TRACKER = "workerTrackerPeriodic"

// This keeps track of the previous day.
const val TIME_INTERVAL_PREVIOUS_WORKER_DATE = "previousWorkerTimeInterval"
const val DEFAULT_INTERVAL_PREVIOUS_WORKER_DATE = "NULL"

const val SHARED_PREFERENCE_ALLOW_WEEK_RESET = "allowWeekReset"
const val DEFAULT_ALLOW_WEEK_RESET = true

// =================================================================================================
/*
 * Amount of water tracked
 */
// =================================================================================================
// This is the amount a user should drink water.
const val SHARED_PREFERENCE_AMOUNT_DAILY = "numeratorDaily"
const val SHARED_PREFERENCE_AMOUNT_WEEKLY = "numeratorWeekly"
const val SHARED_PREFERENCE_AMOUNT_MONTHLY = "numeratorMonthly"
const val DEFAULT_AMOUNT_DAILY_WEEKLY_MONTHLY = 0

// This is the default for the amount of water that a user should drink.
const val SHARED_PREFERENCE_GOAL_DAILY = "denominatorDaily"
const val DEFAULT_GOAL_DAILY = 2000
const val SHARED_PREFERENCE_GOAL_WEEKLY = "denominatorWeekly"
const val DEFAULT_GOAL_WEEKLY = 14000
const val SHARED_PREFERENCE_GOAL_MONTHLY = "denominatorMonthly"
const val DEFAULT_GOAL_MONTHLY = 60000

//Variable that contains the recommended amount of water to drink
const val SHARED_PREFERENCE_RECOMMENDED_AMOUNT = "recommendedAmount"
// =================================================================================================
/*
 * User info.
 */
// =================================================================================================
// Variables related to the date of birth
const val SHARED_PREFERENCE_DATE_OF_BIRTH = "DateOfBirth"
const val DEFAULT_DATE_OF_BIRTH = "NULL"

// variables for the selected gender.
const val SHARED_PREFERENCE_GENDER = "gender"
const val DEFAULT_GENDER = "Male"

// variables for the height
const val SHARED_PREFERENCE_HEIGHT = "height"
const val DEFAULT_HEIGHT = 200

// variables for the weight
const val SHARED_PREFERENCE_WEIGHT = "weight"
const val DEFAULT_WEIGHT = 200

// variables for the activity level
const val SHARED_PREFERENCE_ACTIVITY_LEVEL = "activityLevel"
const val DEFAULT_ACTIVITY_LEVEL = "Low"

// variables for the season
const val SHARED_PREFERENCE_SEASON = "season"
const val DEFAULT_SEASON = "Winter"
// =================================================================================================
/*
 * Variables for the Goal Fragment.
 */
// =================================================================================================
const val SHARED_PREFERENCE_SPINNER_ACHIEVEMENTS = "spinnerAchievements"
const val DEFAULT_SPINNER_ACHIEVEMENTS = "Day"
// =================================================================================================
/*
 * Variables for the settings.
 */
//==================================================================================================
// this is the variable that allows to store if the notification is activated.
const val SHARED_PREFERENCE_NOTIFICATION = "notification"
const val DEFAULT_NOTIFICATION = true

// determines if the user wants drinking reminders
const val SHARED_PREFERENCE_DRINKING_REMINDER = "drinkingReminder"
const val DEFAULT_DRINKING_REMINDER = true

// allows the user to pick a time interval for the notification
const val SHARED_PREFERENCE_TIME_INTERVAL = "timeInterval"
const val SHARED_PREFERENCE_TIME_INTERVAL_TRACKER = "timeIntervalTracker"
const val DEFAULT_TIME_INTERVAL = 15

// determines if the user wants bmi record notification
const val SHARED_PREFERENCE_BMI_RECORD_NOTIFICATION = "bmiRecordNotification"
const val DEFAULT_BMI_RECORD_NOTIFICATION = true

// determines if the user wants achievements notification.
const val SHARED_PREFERENCE_ACHIEVEMENT_NOTIFICATION = "achievementNotification"
const val DEFAULT_ACHIEVEMENT_NOTIFICATION = true

// These are the notification id
const val NOTIFICATION_ID_INTAKE = 1
const val NOTIFICATION_ID_ACHIEVEMENT = 2
const val NOTIFICATION_ID_BMI_RECORD = 3
//==================================================================================================

const val SHARED_PREFERENCE_TIME_INTERVAL_BMI_RECORD = "timeIntervalBMIRecord"
const val DEFAULT_TIME_INTERVAL_BMI_RECORD = "day"

//==================================================================================================

const val ACTIVITY_SELECTION_NOTIFICATION = "activitySelectionNotification"
const val ACTIVITY_SELECTION_NOTIFICATION_INTAKE = "intake"
const val ACTIVITY_SELECTION_NOTIFICATION_ACHIEVEMENT = "achievement"
const val ACTIVITY_SELECTION_NOTIFICATION_BMI = "bmi"

//==================================================================================================

const val SHARED_PREFERENCE_ALLOW_USER_DAY_GOAL = "allowUserDayGoal"
const val SHARED_PREFERENCE_ALLOW_USER_WEEK_GOAL = "allowUserWeekGoal"
const val SHARED_PREFERENCE_ALLOW_USER_MONTH_GOAL = "allowUserMonthGoal"
const val DEFAULT_USER_GOAL = false

const val SHARED_PREFERENCE_SPINNER_STATISTICS = "spinnerStatistics"


