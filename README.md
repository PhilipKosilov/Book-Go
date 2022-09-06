### Book&go


**App architecture:**

***:app***

Shows splash screen using `SplashScreen API`. Checks login data and navigates to either **sign in** or **main** (hotels) screen.

***:core***

Provides common dependencies: local and remote repositories, database etc.  

***:feature_auth***

Contains **sign in** and **sign up** screens. On successful authorization goes to the **main** screen.

*Currently **crashes** after successful authorization because navigation is set up incorrectly.*

***:feature_hotels***

Contains **main** screen with a list (`RecyclerView`) of hotels available and **search bar** (in development).

A click on a hotel item navigates to **hotel details** screen (in development).

***:feature_favorites***

Contains a screen with a list of hotels, marked as favorite (in development).

***:feature_settings***

Contains a screen with app's settings (in development).

### Pet project requirements:
- [ ] At least 2 Activities
- [ ] Foreground Service
- [x] Graph with Fragments (Jetpack navigation). Master-details pattern  
- [ ] List of items at least with two types
- [ ] Custom view (optional)  
- [x] Drawer or Bottom Navigation
- [ ] Night Themes
- [x] Animations
- [ ] Schedule task with WorkManager
- [x] Persistence: user preference in Shared Preferences and cached data in Room
- [x] At least one network call REST  
- [ ] One screen with MVP. RxJava
- [x] One screen with MVVM. Coroutines, Flow, LiveData
- [x] Dagger 2 for (DI)
- [x] Picasso or Glide for image loading
- [ ] One screen with Espresso UI tests
- [ ] Google Maps (optional)
- [ ] Firebase push
- [ ] Crashlytics with Firebase
- [ ] Obfuscation with R8
- [ ] Create release build
