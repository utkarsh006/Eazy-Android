# Android Files Naming Conventions

There are actually no official documents released about naming conventions in Android projects. So, some of you might think that there is no need to have naming conventions in our Android projects. Trust me, it does not harm you in any way to adopt good and consistent naming across your Android project. Instead, it will give you several benefits:

1. Meaningful filenames allow you to have a good idea on what is roughly inside the file, just by looking at the file name. This is especially helpful in bigger projects as you will often navigate within the project to find some files.
2. Better organisation of the project as similar files are grouped together because of their names.
3. No more confusion about names of resources or components if there are similar names in the same project
4. Convenient way of giving a name to a new resource file or source file as you just need to follow the naming convention.

Below are some guidelines on good naming conventions and guidelines:

## strings.xml

* Consider prefixing with layout name or sections, so that we know which sections it belong to
* Use namespaces. Eg. global_ or error_, etc.
* Write string values in normal conventions (do not capitalize all characters).

## colors.xml & dimens.xml

* Treat colors.xml as palette of colors. Instead of defining color per elements, define a few color theme to be used in the application.
* Similarly, for dimens.xml, treat it as palette of typical spacings and sizes in the application instead of individual values of paddings and margins of each component.

## Layout Files

* The naming of layout resource files can be prefixed according to the table below, as it would help to categorize layout for similar components together, which leads to neater organisation.

| Component | Prefix |
|---|---|
 |Activity| `activity_`|
 |Fragment| `fragment_` |
 |Dialog| `dialog_`|
 |AdapterView item| `item_`|
 |Menu| `menu_`|
 |Partial| `partial_`|

## Resource IDs

* Although Android allows same IDs for different view elements in different layouts within the same project, it is advisable not to do so. One way of naming the element component inside the layout is to use their short form, eg. btn for Button, txt for TextView. Layout name can also be prepended to these ids.

| Element      | Prefix                |
|--------------|-----------------------|
| TextView     | `<layout_name>_txt_`  |
| EditText     | `<layout_name>_et_`   |
| Button       | `<layout_name>_btn_`  |
| Menu         | `<layout_name>_menu_` |
| ListView     | `<layout_name>_lv_`   |
| RecyclerView | `<layout_name>_rv_`   |
 | ImageView| `<layout_name>_img_` |
 |LinearLayout| `<layout_name>_ll_` |
 | FrameLayout| `<layout_name>_fl`|

## Drawable Files

* Drawable files can be prefixed according to its asset type. It is summarised below:

| Component | Prefix     |
|-----------|------------|
| Button    | `btn_`     |
| Dialog    | `dialog_`  |
| Divider   | `divider_` |
| Menu      | `menu_`    |
| Icon      | `ic_`    |
| Image     | `img_` |

These naming conventions are guidelines that can help developers when building their Android application. Of course, you may not need to follow these guidelines 100% in your projects. In fact, you are also free to adjust these guidelines to your liking, or even use your own naming conventions in your projects. However, more importantly is that, once you have decided on the naming convention for a project, you should stick to it for the rest of that particular project, so as to avoid inconsistencies in naming that may cause confusion.
