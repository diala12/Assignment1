package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class DAbacteria {
    ArrayList<bacteria> bacterias =new ArrayList<>();

    public  DAbacteria()
    {
        bacterias.add(new bacteria( 1,"ball","تتواجد البكتيريا المكورة بشكل فردي، أو زوجي، أو على هيئة سلاسل، أو عناقيد وفقاً للظروف البيئية والبكتيرية المحيطة، مع العلم أنّ هذا النوع يتخذ شكلاً بيضوياً دائرياً، وقد يُسبب هذا النوع من البكتيريا الدمامل، أو التهاب السحايا، أو الالتهاب الرئوي، أو الحمى القرمزية."));
        bacterias.add(new bacteria( 2,"dama","تظهر البكتيريا الضمة بشكل حلزوني، أو على شكل الفاصلة في الكتابة، مع العلم أنّها تعيش في البيئات المائية، وتنتقل بحركة اندفاعية باستخدام سوط واحد، حيث يشبه الهيكل الخارجي لها شكل السوط، وتسبب هذه البكتيريا مرض الكوليرا."));
        bacterias.add(new bacteria( 3,"moltawyeh","تتخذ البكتيريا الملتوية شكلاً دائرياً طويلاً، ورفيعاً، ومرناً، وعادة ما تتحرك بطريقة دائرية في الأنسجة المبطنة بالمخاط أو البيئات اللّزجة، ويسبب هذا النوع من البكتيريا مرض الزُهري، أو مرض اللايم (Lyme disease)."));
        bacterias.add(new bacteria( 4,"nail","تتخذ البكتيريا الحلزونية شكلاً حلزونياً صلباً، وتُسبب هذه البكتيريا العديد من الأمراض التي تتناقل عن طريق الطعام، أو قد تُسبب الإسهال، أو التهاب وقرحة المعدة."));
        bacterias.add(new bacteria( 5,"orga","تأخذ البكتيريا العصوية شكل النقانق، وتتواجد منفرة أو على شكل سلاسل مترابطة، وقد تصل هذه البكتيريا إلى جسم الإنسان عن طريق تناول الطعام والشراب الملوثين، ويمكن أنْ تسبب هذه البكتيريا أمراضاً متعددة؛ مثل الإسهال، وهناك أنواع تصيب الجهاز التنفسي، وتسبب الخُنَّاق (الدفتيريا)، أو مرض الجمرة الخبيثة."));
    }

    public List<bacteria> getbacteriaByname(String name)
    {
        List<bacteria> bacteriaList =new ArrayList<>();

        for (bacteria i:bacterias) {
            if(i.getName().equals(name))
            {
                bacteriaList.add(i);
            }
        }
        return bacteriaList;

    }

}
