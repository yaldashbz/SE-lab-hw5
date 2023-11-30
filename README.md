# آزمایش پنجم آزمایشگاه مهندسی نرم‌افزار (BDD)
## شرح آزمایش

### ساخت پروژه و نیاز‌مندی‌ها

نخست یک پروژه‌ی جدید maven می‌سازیم. همچنین فزودن dependencyهای موردنیاز شامل JUnitو Cucumber به فایل pom.xml پروژه را انجام می‌دهیم.
همچنین با اجرای Maven->Test از طریق navigation bar سمت راست صفحه و اطمینان از انجام موفق آن با دیدن پیغام BUILD SUCCESS. (در این زمان برای دانلود dependencyها نیاز به اینترنت است و در صورتی که ارتباط برقرار نباشد با خطا مواجه می‌شود).

![Screenshot (233)](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/01a3adaa-b4d9-4fca-ad5e-21b48f283d63)

ایجاد یک پکیج جدید به نام resources در پکیج test پروژه و راست کلیک بر روی آن و انتخاب Mark Directory as Test Resource Root
ایجاد پکیج جدید با نام calculator در مسیر src->main->java و ایجاد دایرکتوری جدید با نام features در مسیر test->resources
![image](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/50c187df-22b4-48c5-ad78-265f47e13761)

ایجاد فایل جدید با عنوان calculator.feature در زیر دایرکتوری feature و نوشتن سناریوی عملیات گفته شده دو عدد در آن

![image](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/028ecbee-a466-48d1-8fcc-864859101657)
زبان نوشتن featureها Gherkin است که باید توسط cucumber ترجمه و اجرا شود. با ذخیره فایل، برخی از خطوط به رنگ زرد درمی‌آیند زیرا مشخص نیست باید چطور تفسیر شوند. برای حل این مشکل، به انتهای هر یک از خطوط Given، When و Then رفته و کلید Alt+Enter را می‌زنیم تا یک فایل جهت تعیین مراحل و stepهای اجرای سناریو ایجاد شود. قبل از این کار یک دایرکتوری با نام calculator در مسیر test->java ایجاد می‌کنیم تا در آن ساخته شود:
متدهای بدون بدنه به صورت زیر در فایل StepDefs ایجاد می‌شوند:
بر روی فایل calculator.feature کلیک راست کرده و گزینه Run را انتخاب می‌کنیم تا سناریوی این feature اجرا شود:




![image](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/bb0c9b6d-25b5-4430-907c-ca18570b266f)


![image](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/27238773-5094-47e7-829e-1a61619aaadf)
![image](https://github.com/yaldashbz/SE-lab-hw5/assets/62180624/98db33b4-dc52-4104-9ba9-e34f99de6d6b)







