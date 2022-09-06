package com.example.bookgo.core.data.source.temp

import com.example.bookgo.core.data.api.HotelsRetrofitApi
import com.example.bookgo.core.data.models.HotelsModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder

/*
Temporary data source for testing
// todo: switch to RetrofitInstance when done
 */

object LocalDataSource : HotelsRetrofitApi {
    private val gson: Gson = GsonBuilder().create()

    override suspend fun getHotels(): HotelsModel = gson.fromJson(json, HotelsModel::class.java)

    val json = """
        {
            "data": [
                {
                    "hotelId": "7d5158f8-3de7-4ce3-9a24-036b3c843c52",
                    "name": "Impala No Availabilities Motel [SANDBOX] (Example Hotel)",
                    "currency": "EUR",
                    "starRating": 1,
                    "description": {
                        "short": "\"This fictional example hotel allows you to experience all the content, rates and features the Impala platform (https://impala.travel) has to offer. It is unavailable though so do not even bother with trying to reserve anything\""
                    },
                    "phoneNumbers": [
                        "+4561234567"
                    ],
                    "contractable": true,
                    "emails": [
                        "youremail@sinkhole.staging.impala.travel"
                    ],
                    "websiteUrl": null,
                    "images": [],
                    "address": {
                        "line1": "456 Impala Street",
                        "line2": null,
                        "city": "Impalaland",
                        "postalCode": "0987-654",
                        "region": "Impalaland Dark Hole",
                        "country": "GBR",
                        "countryName": "United Kingdom of Great Britain and Northern Ireland"
                    },
                    "location": {
                        "longitude": -9.952544,
                        "latitude": 58.386185
                    },
                    "timezone": "Europe/London",
                    "amenities": [],
                    "roomCount": 100,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-05-26T13:29:22.000Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": []
                },
                {
                    "hotelId": "3faf8507-307f-4846-936c-a1465b3cfc42",
                    "name": "Royal Palm Beach Resort [SANDBOX]",
                    "currency": "ANG",
                    "starRating": 3,
                    "description": {
                        "short": "How would you like to spend a week or longer with a beautiful, white sandy beach right at your doorstep? You can, when you stay at Royal Palm Beach Resort on Saint Martin/Saint Maarten in the Caribbean. Just imagine strolling along the gorgeous beach, swimming in the sparkling blue waters, and just relaxing by the pool at the resort.  If you are looking for the ultimate in relaxing vacations, you will find it at Royal Palm Beach Resort."
                    },
                    "phoneNumbers": [
                        "888.249.8810"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+3faf8507-307f-4846-936c-a1465b3cfc42@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec55gi008x0uo52tnnaw5c.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec4k5j008t0uo5828shuij.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2527,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec4prc008u0uo5b75wcwzk.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec4yuj008w0uo57d1l2qk7.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec5elh008y0uo5a6wxbfge.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2527,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec5l3b00900uo528jt49h8.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec5wyf00920uo5elq7g20c.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2534,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/cknec88e3009d0uo5f13ycdp8.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "115 Welfare Road",
                        "line2": null,
                        "city": "Philipsburg",
                        "postalCode": "0",
                        "region": null,
                        "country": "SXM",
                        "countryName": "Sint Maarten"
                    },
                    "location": {
                        "longitude": -63.0942208,
                        "latitude": 18.0351654
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 168,
                            "formatted": "Onsite laundry"
                        },
                        {
                            "code": 233,
                            "formatted": "Tennis court"
                        },
                        {
                            "code": 234,
                            "formatted": "Water sports"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 84,
                            "formatted": "Spa"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        },
                        {
                            "code": 345,
                            "formatted": "Fitness Center"
                        }
                    ],
                    "roomCount": 140,
                    "checkIn": {
                        "from": "16:00",
                        "to": "00:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-12T09:01:45.745Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "bb1e2abe-e0ad-45c0-83a1-139b40a0ce3c",
                            "name": "2 Bedroom Ocean View",
                            "description": "Discover comfortable accommodations featuring a king size bed and a queen size sofa bed in the living room. Fall asleep each night to the tranquil sounds of the ocean’s tide and wake up each morning to breathtaking ocean views from your balcony or terrace. Bathroom amenities include a walk-in shower, complimentary amenities and hair dryer. Enjoy the convenience of our full kitchen equipped with a refrigerator, microwave and dishwasher. Additional in-room amenities include cable/satellite television, VCR/DVD player, telephone, air conditioning and easy beach access.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 126,
                                    "formatted": "Air conditioning individually controlled in room"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 92,
                                    "formatted": "Safe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 157,
                                    "formatted": "Ceiling fan"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecef9900a30uo51wn0d0oy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecyvqv00b60uo572756nph.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecy2nl00b40uo5glxy2itq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecxh0c00b30uo53fnzbsb3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecw0t600b00uo56m4u7qye.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecvlmu00az0uo511lu97ej.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecv6fx00ax0uo5b7wc92pj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecdfqd009w0uo52ekobr61.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecuqp900aw0uo5aqxtcefd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecueuz00au0uo5h88lfscs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecstun00ar0uo57je06niw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/ckneclf0u00aj0uo52ms5e4c7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknechw4b00ag0uo54hxeffoe.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecgiwk00ae0uo5bxsofwpb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecg6am00ad0uo5h3fl6xl9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecfu2u00aa0uo5asi3gr7t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecdqeu009z0uo50haq8hib.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknece3po00a00uo5geps9o7w.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/ckneceqm700a50uo575gv6z8e.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecf6sl00a60uo51qh253jb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3763,
                                    "url": "https://cdn.impala.travel/properties/cknecficf00a90uo52yje9lk3.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "38a37699-e5a8-4aa4-a54a-8444eb5b7993",
                            "name": "1 Bedroom Ocean View",
                            "description": "Discover comfortable accommodations featuring a king size bed and a queen size sofa bed in the living room. Fall asleep each night to the tranquil sounds of the ocean’s tide and wake up each morning to breathtaking ocean views from your balcony or terrace. Bathroom amenities include a walk-in shower, complimentary amenities and hair dryer. Enjoy the convenience of our full kitchen equipped with a refrigerator, microwave and dishwasher. Additional in-room amenities include cable/satellite television, VCR/DVD player, telephone, air conditioning and easy beach access.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 92,
                                    "formatted": "Safe"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 126,
                                    "formatted": "Air conditioning individually controlled in room"
                                },
                                {
                                    "code": 157,
                                    "formatted": "Ceiling fan"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned0efs00bf0uo5gznv7vw4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned5t3z00ca0uo5fpok75ec.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned6we200cc0uo5gi43164d.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned7gef00cd0uo5d9ia8049.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned3o0n00c60uo5af8f80r6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned48aj00c80uo55fobaru1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned5cfx00c90uo50rwn1549.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2533,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckneczyrb00bc0uo56bftb7l2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2533,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned06ln00bd0uo5by7481hf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned0mrl00bi0uo5ecud5dfh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2533,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned0z7k00bm0uo542b7hqmz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned1g0f00bp0uo5bxms0zlm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned1xec00bu0uo5eep51r2a.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2534,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckned315f00c00uo54d6eeqa0.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "f14de8c1-57be-4333-9a37-f13acc77836c",
                    "name": "Flamingo Beach Resort [SANDBOX]",
                    "currency": "ANG",
                    "starRating": 3,
                    "description": {
                        "short": "Beautiful white sand, sparkling blue waters, sunny skies - where else can you find all of this but in Saint Martin/Saint Maarten in the Caribbean? When you stay at Flamingo Beach Resort, you will have all of this, and more. Here you can have the most relaxing vacation of your life, or enjoy some of the many outdoor adventures in the area. If you love water sports, you can go windsurfing, swimming and snorkeling. "
                    },
                    "phoneNumbers": [
                        "1.800.438.2929"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+f14de8c1-57be-4333-9a37-f13acc77836c@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckneccvrf009t0uo53ix45olq.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecbm57009n0uo54rai0fv1.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecbxcc009o0uo56lp67j8f.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecc6pw009q0uo57li805ml.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 2999,
                            "url": "https://cdn.impala.travel/properties/ckneccidz009r0uo5f8c8eitk.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecd9ay009v0uo5bj4i21sr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecdpkw009y0uo58gcp7357.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknece6jz00a10uo5hfhicfao.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2559,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/cknecennr00a40uo50cvw7hbl.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 2999,
                            "url": "https://cdn.impala.travel/properties/cknecf7dn00a80uo59icwd1dd.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 2999,
                            "url": "https://cdn.impala.travel/properties/cknecfur200ab0uo53ew0fswu.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "6 Billy Folly Road",
                        "line2": null,
                        "city": "Philipsburg",
                        "postalCode": "",
                        "region": null,
                        "country": "SXM",
                        "countryName": "Sint Maarten"
                    },
                    "location": {
                        "longitude": -63.0956031,
                        "latitude": 18.0288475
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 168,
                            "formatted": "Onsite laundry"
                        },
                        {
                            "code": 234,
                            "formatted": "Water sports"
                        },
                        {
                            "code": 272,
                            "formatted": "Snow skiing"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 206,
                    "checkIn": {
                        "from": "16:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-12T08:40:54.227Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "59a25889-cfe7-4960-a22b-bc9fd3d7a639",
                            "name": "Studio Ocean View",
                            "description": "Discover elegance and comfort in your accommodation featuring a king size bed, sofa bed and a well appointed full bathroom with a 3/4 bath and complimentary amenity kit. Enjoy the convenience of the full kitchen equipped with a refrigerator, coffee maker, microwave and many other modern appliances. Additional in-room amenities include cable/satellite television, DVD player, iron/ironing board, air conditioning and a balcony/patio.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebx4ir00840uo50yixhw4z.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebw6ae00820uo50gh72966.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebwsnx00830uo55wfrhdqd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebydah00850uo5aowbf1vn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebyl1q00860uo5c09bayee.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebysmc00870uo5fvyj31a1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebz19w00880uo50qu46qch.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebz9ai00890uo515dp3qt2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebzp7p008a0uo52v1jee2m.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2559,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknebzx9j008b0uo5fnjz60o0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec0d88008c0uo5ecbj1m2b.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec0n3a008d0uo5aq6a0nsl.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "a249c80f-17dc-45c9-b91b-9b55a69b0fcc",
                            "name": "1 Bedroom Ocean Front",
                            "description": "Discover elegance and comfort in your accommodation featuring a king size bed, sofa bed and a well appointed full bathroom with a 3/4 bath and complimentary amenity kit. Enjoy the convenience of the full kitchen equipped with a refrigerator, coffee maker, microwave and many other modern appliances. Additional in-room amenities include cable/satellite television, DVD player, iron/ironing board, air conditioning and a balcony/patio.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec291n008j0uo5gu6rdk1x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec3l4p008o0uo5hnasfmmk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec49bq008r0uo54w37aqqp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec4ydp008v0uo5224hdslr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2559,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec5knn008z0uo521o6hupf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec5vep00910uo5bfzo0ptd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec6bsy00950uo54op68crm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec213k008h0uo5epbo8cnq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec6ub400970uo52nt3au6i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec774y00990uo56ocf5s52.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec2zl5008n0uo510r5brvp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec2qa0008m0uo5bymsazeh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec3xwb008q0uo56nodexlc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec2hdq008k0uo51nlr5k8e.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "c16da807-c2f7-435c-967b-9cfd8b7fe9ef",
                            "name": "Studio",
                            "description": "Discover elegance and comfort in your accommodation featuring a king size bed, sofa bed and a well appointed full bathroom with a 3/4 bath and complimentary amenity kit. Enjoy the convenience of the full kitchen equipped with a refrigerator, coffee maker, microwave and many other modern appliances. Additional in-room amenities include cable/satellite television, DVD player, iron/ironing board, air conditioning and a balcony/patio.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec8c8z009e0uo5dx4r8m49.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec8nrv009f0uo5gwe69c8u.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec8z3u009g0uo524rp9d8u.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec83pv009c0uo5dv9z8hpv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec7sa0009b0uo5biqc4unn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec9hm6009h0uo5a0erhio8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckneca228009j0uo5flyb9i6t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/cknec7kch009a0uo5hp7p887g.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "f63b534a-d39d-4199-ba47-32650695102b",
                    "name": "Gran Hotel Sardinero [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "In a unique reconstructed and renovated building in an enviable location, Gran Hotel Sardinero is the perfect starting point for exploring Santander’s cultural, leisure and business activities."
                    },
                    "phoneNumbers": [
                        "+34 942 27 11 00"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+f63b534a-d39d-4199-ba47-32650695102b@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7pvko007s0uo53ern6inn.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7pazj007n0uo5b5a29m6i.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7pevk007o0uo585yi2kon.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7phxo007p0uo5g5gw50af.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7pm8m007q0uo5d17j3fsm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7pqwk007r0uo562um1myw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7q07z007t0uo53habccs0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7q4uk007u0uo5db0dcb5b.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7q90f007v0uo54sc31pny.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7qd6x007w0uo52tlj5ld3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7qil1007x0uo539e408pz.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7qmog007y0uo5amfka2mq.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7qrwo007z0uo5ciaocxnm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7qwen00800uo59iq16h3n.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna7r0hb00810uo50mhmca8p.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Plaza De Italia 1",
                        "line2": null,
                        "city": "Santander",
                        "postalCode": "39005",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -3.7829882,
                        "latitude": 43.4724545
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 239,
                            "formatted": "Beachfront"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        }
                    ],
                    "roomCount": 102,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T11:30:44.003Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "22ff9d8e-dec1-43c3-b656-1ca20ec0fc45",
                            "name": "Junior Suite Single Use",
                            "description": "Room with a bed of 1.80 meters and a small room. All Junior Suites have Bathtub.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 673,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5ie83004y0uo58jlh0gzh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5jjyg004z0uo5dmhxgznz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5lidl00520uo54zzk9pp7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 851,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckna5lsv000540uo526g305o3.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "5e255aa4-c8a2-4ccd-80cb-58a285d2d17e",
                            "name": "Sea View Double Room with Terrace",
                            "description": "Double room with a bed of 1.80 meters, terrace and sea views. All rooms with terrace have shower.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 851,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckna5o98o005c0uo5egqh76dx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5n6vb00580uo582prdfhk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5ms4000550uo5aqe8ec7j.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5rddg005j0uo5772m67sq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5qlfd005g0uo58i5l7zuq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5pwnt005e0uo57pqe6t42.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5orq9005d0uo551lc0xup.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5nmw1005a0uo594yp03pw.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ef0853e5-960e-418d-890b-ef2d4ed11cd4",
                            "name": "Triple Junior Suite",
                            "description": "Room with a bed of 1.80 meters, plus a sofa bed, a small living room. All Junior Suites have Bathtub.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5u7u2005q0uo5hbdx27wo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5up5j005r0uo5fiwj7ubx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5v8ze005t0uo5h8i12zzx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5vrko005v0uo5bwh85o74.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5w8v9005x0uo55mix6dd8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2619,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5wzu2005z0uo5fezefhon.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "b9489d16-01a7-43a8-a374-472d4b4a61b7",
                            "name": "Standard Family Room",
                            "description": "Room with two 1.50 beds for two adults and one or two children sharing a bed. Oriented to the Grand Casino / San Roque. All relatives have a bathtub.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 13,
                                    "formatted": "Bathtub"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2619,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6nqp100720uo508b0h77j.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6jb62006y0uo527ez55pa.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6lrqb00710uo547hefpvd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6k4sh006z0uo5320c467g.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6psae00730uo527k2h00l.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "f7a8cdb6-3976-47d6-b950-0140c36eac89",
                            "name": "Junior Suite",
                            "description": "Room with a bed of 1.80 meters and a small room. All Junior Suites have Bathtub.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna6wcul00780uo52ruugwn2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6uvun00770uo5ds596k70.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6tnzv00760uo5bs6g3qjl.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6sj8800750uo57x5sh6ds.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6rjzh00740uo53h5xb1mk.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "4135d1aa-ba35-448c-940e-5ab99823f0ba",
                            "name": "Sea View Family Room",
                            "description": "Room with two 1.50 beds for two adults and one or two children sharing a bed. Sea View. All relatives have a bathtub.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 576,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna6yq95007a0uo52aj6cwg1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 576,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna6xvqf00790uo5h2v239wb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna71ppf007d0uo526yxh875.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckna70i8r007c0uo51pzx1eo8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 576,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna6zhe7007b0uo5bv9w4ads.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "f8a540f1-bfd7-4607-a0e7-cd23ee9dbed1",
                            "name": "Sea View Double Room",
                            "description": "Double room with two beds of 1.05 together or a bed of 1.80. With sea views. Some rooms have a shower and others have a bathtub.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5e9g6004q0uo562pl78ki.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5ejsh004r0uo5eawqfkcn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2705,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5evf3004s0uo5fo700jzd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckna5fw88004t0uo5dvae5e46.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 673,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna5gub6004u0uo58c4b6wa6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/area-types/ckna9w2uh00033b6bpdms8z61.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/area-types/ckna9w0g000023b6bd5du0p93.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5e073004p0uo5b6hy39fa.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "1067b989-687b-460a-a9ab-4d2e8ad15343",
                            "name": "Standard Single Room",
                            "description": "Single Room with 1.05 bed. Oriented to Panama Street.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6edza006s0uo5a41ad6av.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/area-types/ckna9uft100013b6b1uasucjj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6agqx006m0uo593g1bg7f.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckna6hrjt006x0uo5e69ighgl.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2713,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna6gdqc006v0uo54y4h42ey.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2523,
                                    "url": "https://cdn.impala.travel/properties/ckna6c4oe006q0uo58i7n9sz7.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "1dcee284-afc0-4938-a7a4-ecc8a5cf64e4",
                            "name": "Standard Room",
                            "description": "Double room with two beds of 1.05 together or a bed of 1.80. Oriented to Panama street. Some rooms have a shower and others have a bathtub.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna60u3000680uo5fxx74skd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 851,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckna61o6k00690uo5bjhehouz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5zs0j00670uo5cfeweyvj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5yrif00640uo5630dai92.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2705,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5z3c700660uo56iap2pjq.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "4267b808-0aa0-43fc-a71a-b5cbdf353bf4",
                            "name": "Standard Room with Extra Bed",
                            "description": "Double room with two beds of 1.05 together or a bed of 1.80, plus a bed of 1.05. Oriented to Panama street. Some rooms have a shower and others have a bathtub.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna7bvgt007k0uo5gf7qgit5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna7fecv007m0uo5ceg28ht7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 851,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckna7dbo2007l0uo555erftdr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna7azjd007j0uo5gtkthaho.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ab134086-9fb4-47d5-ab51-f92b8e561fe2",
                            "name": "Sea View Double Room with Extra Bed",
                            "description": "Double room with two beds of 1.05 together or a bed of 1.80, plus a bed of 1.05. With sea views. Some rooms have a shower and others have a bathtub.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2523,
                                    "url": "https://cdn.impala.travel/properties/ckna641i1006e0uo5egtaa5gt.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna64tmo006g0uo5cgpi90sb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2619,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna68tax006k0uo5banz50no.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna63aok006d0uo51qs42yqf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2523,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna67gb8006j0uo5eutyhhoc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna65gb2006h0uo5cxqd9un1.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ca217c6a-4f4f-4c38-9cd8-28cc46407f7e",
                            "name": "Sea View Single Room",
                            "description": "Single room with two beds of 1.05 together or a bed of 1.80. With sea views. Some rooms have a shower and others have a bathtub.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna76qxd007h0uo5al3d3atq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckna75q0g007g0uo5gwtn0k7h.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2705,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna74q44007f0uo55jxc22f9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna73r2u007e0uo5b2302jba.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna780db007i0uo5e4uj6wu8.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "85b17e87-7928-4ef0-897c-f7d2d056bb71",
                    "name": "Hotel degli Orafi [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "The Hotel degli Orafi is a prestigious building in the historic centre of Florence and offers you a wide range of services and comforts.\n\nAs soon as you arrive you will find yourself in a welcoming and warm atmosphere were you will immediately be taken care of by our multilingual staff in the reception. You will be offered a \"Welcome Drink\" to enjoy on our beautiful roof terrace bar. "
                    },
                    "phoneNumbers": [
                        "+39 055 26622"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+85b17e87-7928-4ef0-897c-f7d2d056bb71@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1968,
                            "width": 2986,
                            "url": "https://cdn.impala.travel/properties/ckna6389z006c0uo53gyeb9oq.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 3840,
                            "width": 2570,
                            "url": "https://cdn.impala.travel/properties/ckna61sei006a0uo56txresa3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1997,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna62ckp006b0uo51jq4dou6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1997,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna64p8r006f0uo51csrhy1v.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2570,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna66uyn006i0uo5b21wgdy5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2000,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna69uej006l0uo5b42o125u.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1996,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna6ar7o006n0uo56oo3e0e7.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1997,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna6btyx006p0uo5a0hh22xp.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2570,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna6d75q006r0uo5f78fcqtr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1997,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckna6eqpg006t0uo5a2697p4u.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2555,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna6hpce006w0uo58sxd6dg0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckna8mbym00013b6bkhxwfv3v.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckna8men700023b6bau83isee.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckna8mh5v00033b6buwt9h0j5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckna8mimg00043b6bkp4zogqe.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckna8mku300053b6bqwmegnjc.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Lungarno Degli Archibusieri, 4",
                        "line2": null,
                        "city": "Florence",
                        "postalCode": "50122",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 11.2545428,
                        "latitude": 43.7680448
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 14,
                            "formatted": "Business library"
                        },
                        {
                            "code": 26,
                            "formatted": "Currency exchange"
                        },
                        {
                            "code": 36,
                            "formatted": "Express check-in"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 37,
                            "formatted": "Express check-out"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 50,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T10:47:36.463Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "36d5853a-7a57-4a87-b963-3be0a7e30869",
                            "name": "Triple Executive",
                            "description": "Welcoming rooms with encaustic walls by a famous Florentine craftsman. The rooms are provided with either carpet or parquet floor. Including all comforts.The Triple rooms are very spacious and some of them have a view over the Arno river, Palazzo Vecchio, the Vasarian Corridor or the Georgofili Academy.For the rooms with River view or Palazzo Vecchio view we ask for a supplementThe rooms have either a King size bed (180x200) + one extra bed or 3 separate beds.Size: 20-30m2. Please indicate the child's  age (years at the stay's date) to get the exact quotation.\n",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8nud6000d3b6bh3dvfjvo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 803,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8np4g000a3b6b704wqgzv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 803,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8nms100093b6bm4vw85f7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2570,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5hq61004v0uo504jr7jug.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1875,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5i5o2004x0uo54zd9bkvk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2570,
                                    "url": "https://cdn.impala.travel/properties/ckna5hyqy004w0uo5gpzz94k5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8nsae000c3b6bo9sy2xip.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8nqo5000b3b6bqpe08ago.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "7e557111-d372-4789-9583-3d1a29ca1dfe",
                            "name": "Executive Double Room",
                            "description": "Welcoming rooms with encaustic walls by a famous Florentine craftsman. The rooms are provided with either carpet or parquet floor. Including all comforts.The Executive rooms are very spacious and some of them have a view over the Arno river, Palazzo Vecchio, the Vasarian Corridor or the Georgofili Academy. The rooms have either a King size bed (180x200) or 2 separate beds. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1793,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8oes9000e3b6bhox187nu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 803,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8ops6000f3b6bkuzsen3o.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2570,
                                    "url": "https://cdn.impala.travel/properties/ckna5k6p900500uo511mq8bbf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2018,
                                    "width": 2991,
                                    "url": "https://cdn.impala.travel/properties/ckna5l0z700510uo5goxshr1l.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1875,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5lk3n00530uo55y1ofo1c.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "339dd02f-4623-463e-8925-513f51759259",
                            "name": "Deluxe Junior Suite",
                            "description": "These spacious and elegant Suites are unique, each one decorated in their own style.Some of them have a nice comfortable loft with the bedroom and the living room and bathroom below. Some of the suites overlook the Arno river or the Florentine roof-tops.For the River view we may ask for a supplement. The rooms have either a King size bed (180x200) or 2 separate beds. Size: 25 m2",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8n84v00083b6btj26e1yo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8myy000063b6b661n29cz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2570,
                                    "url": "https://cdn.impala.travel/properties/ckna5n5xa00570uo554zq176x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2252,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5niqo00590uo51i9q5njk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2570,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5msvj00560uo5f1xmadk1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/area-types/ckna8n5ua00073b6blzuy63nl.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1875,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5nvfx005b0uo5h141ckz9.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "9b8aa018-b69f-4e16-9887-143d2cfef880",
                            "name": "Family Suite",
                            "description": "Comfortable and welcoming accommodation, characterized by a refined decor and located in the new wing of the hotel. This suite can comfortably accommodate up to 4 adults and a child .  The Suite is on two levels and consists of a living room equipped with a sofa, a coffee-table and a design desk with chair. On the main floor a bedroom and en-suite bathroom plus living area. On the second floor a  bedroom and en-suite bathroom.\nBedding option: King size bed (180x200) or 2 separate beds.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5qcv1005f0uo53nebenkb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5r2p2005i0uo5e2b06mtd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1997,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5rfd6005k0uo59n4kcw91.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1997,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5rswz005l0uo5dubd2ajs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5qpmj005h0uo53ixoae0f.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "8efe1ea9-2a33-474d-aa75-1c4bd1f51911",
                            "name": "Deluxe Apartment",
                            "description": "Comfortable and welcoming accommodation, characterized by a refined decor and located in the new wing of the hotel. This apartment can comfortably accommodate up to 3 people and consists of a living area with a sofa, a sofa-bed for an extra person,  desk with chair, table and foldaway kitchenette. The living room opens to the bedroom with an European king-size bed and a closet and has its own bathroom with bathtub or shower. Bedding option: One King - size bed (180x200) or 2 separate beds. Third person in one sofa-bed.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1997,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5u1iq005p0uo52l3y0e5h.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1997,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5t79q005n0uo55tvgd4ne.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 532,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/area-types/ckna8piwy000g3b6b8obf7zy4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 532,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/area-types/ckna8plpw000h3b6bwvapwdlm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 532,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/area-types/ckna8pntp000i3b6ba275nkyn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5tn0p005o0uo51o6p0w77.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "c00e6d88-2b77-43cc-b1ec-855f8772643c",
                            "name": "Deluxe Suite",
                            "description": "Comfortable and welcoming accommodation, characterized by a refined decor and located in the new wing of the hotel. This suite can comfortably accommodate up to 3 people. The Suite consists of a living area with a sofa, a sofa-bed for an extra person, coffee-table and a desk with chair. The living room opens to the bedroom with an European king-size bed and a closet and has its own bathroom with bathtub or shower. \nBedding option: One King - size bed (180x200) or 2 separate beds. Third person in one sofa-bed.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5vl93005u0uo5c48z5zzb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5wgeo005y0uo500tib2m1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5v5n5005s0uo598wa4k87.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1997,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5w08u005w0uo5gzj9eift.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "a469d834-8107-428d-a271-996e7ba78fda",
                            "name": "Single Room",
                            "description": "Comfortable room with walls painted in warm tones. All rooms are equipped with modern conveniences and have moquette. One single bed 90X200",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5x5hu00600uo5dbldc1dw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckna6kwki00700uo59dxzbk97.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2252,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5xj7y00610uo528em39xb.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "aef0e555-75b4-4d8f-8f6e-f2968c52a79b",
                            "name": "Classic Double Room",
                            "description": "Welcoming rooms with encaustic walls by a famous Florentine craftsman. The rooms are provided with either carpet or parquet floor. Including all comforts.\nThe rooms have either a King size bed (180x200) or 2 separate beds. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2252,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5ylsu00630uo5fw8j2e57.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna5y7qf00620uo535fr0f44.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1875,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckna5z1qd00650uo5df7h4zjb.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "0be271fb-7b1e-4740-8937-6aa26af8a256",
                    "name": "Hotel Bahía [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Hotel Bahía was opened in Santander in 1999, recuperating the hotel’s former splendour of being the hotel of choice for the most significant events on the social, cultural and financial events in the capital of Cantabria. The hotel offers excellent views over the Bay of Santander, a peaceful setting where you can enjoy a few days of relaxation. "
                    },
                    "phoneNumbers": [
                        "+34 94 220 50 00"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+0be271fb-7b1e-4740-8937-6aa26af8a256@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 3002,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna1zhgi00340uo5bds6cxsx.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2980,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna1zu2f00350uo5huc59un4.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3002,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna2051a00360uo52fpp6vvn.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna20gft00370uo57r8v25gm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3002,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna20v6400380uo527xr027w.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2628,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna21akx00390uo5gejt0s3e.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2q88d003r0uo5hpya0ue8.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2qaap003s0uo57po1bo3h.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2qc77003t0uo53cx61lrj.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2qe48003u0uo52htpdmpw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2qfzr003v0uo500aj41m1.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna2qhwt003w0uo5f0jebr24.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Cádiz, 22",
                        "line2": null,
                        "city": "Santander",
                        "postalCode": "39002",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -3.8063721,
                        "latitude": 43.4602898
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 26,
                            "formatted": "Currency exchange"
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 188,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T09:09:24.593Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "e8445c70-3556-4461-9ab4-70b007f5315f",
                            "name": "Junior Suite",
                            "description": "Rooms with lounge and hot tub. Amenities in the bathrooms of Antonio Miró and Álvarez-Gómez. Capsule coffee maker 47 \"TV Bathrobe and slippers, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 65 m² approximately.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 9,
                                    "formatted": "Bath tub with spray jets"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2edhh003h0uo51oe5ekc2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2505,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2fzy9003k0uo5cuxght2i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3002,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2ewiy003j0uo52zvm3ava.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2109,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2ej9z003i0uo5e6387i6a.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "0e3deb47-9388-453e-8a4c-6d45f007031a",
                            "name": "Superior Room",
                            "description": "Rooms larger than double rooms, in some cases with whirlpool bath, in others with dressing room and in other cases with a small lounge. LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 42 m² approximately.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2ud5000450uo5efq3c43w.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2ub5c00440uo571s55v6a.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2u94000430uo5a2yo49lm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3002,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2bqya003f0uo59grg13d6.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "eb132ac2-1004-4709-a458-9d153a9e72de",
                            "name": "Two Beds View to the Cathedral",
                            "description": "Room with two 105 cm beds and views of the Cathedral, LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 32 m² approximately.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2417,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna26v5z003c0uo50djm924c.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2566,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna26nmh003b0uo53abzhgvc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2711,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna26jij003a0uo57ic441ov.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "16cce301-2a05-437e-9d9d-4e57d46a1d01",
                            "name": "Double Bed View to the Cathedral",
                            "description": "Room with one double bed of 150 cm and views of the Cathedral, LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 32 m² approximately.\n\nDouble bed size: 150 cm.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 629,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2tavr003y0uo52es541ws.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2tcuc003z0uo51zqs8scz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna28epz003d0uo5c6m124hw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2t51e003x0uo59vnw4jyr.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "c9b7d2d0-6fb7-427d-b6b2-ea62a159f9d8",
                            "name": "Triple Room",
                            "description": "Rooms with two beds plus a sofa bed or with two beds and another two in a pull-out sofa or extra bed. LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 38 m² approximately.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2987,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2a92d003e0uo5aj20cvm6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 768,
                                    "url": "https://cdn.impala.travel/properties/ckna2tugb00420uo5f5630kta.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 765,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2tqll00400uo55k9f1u8s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 765,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2tsmb00410uo531ck6504.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "617d3ed2-75d1-4336-8f07-35b08c62fb53",
                            "name": "Two Beds Sea View",
                            "description": "Room with two 105 cm beds and views of the bay, LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 35 m² approximately.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 545,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2ur1800460uo5b3t02z85.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2usmd00470uo533xwcnuy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2417,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2djhb003g0uo558moc3q7.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "788479f8-d524-4888-837f-233cc72a302d",
                            "name": "Family Room ",
                            "description": "The Room consisting of a space for parents with a double bed and another space for children with bunk beds. In the centre a common bathroom. LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2389,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2i8b6003l0uo57a5oavfo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 600,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/properties/ckna2vhm600480uo55f550ddv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 682,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2vjii00490uo5dt4bdw83.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 682,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2vlnx004a0uo57lcphe2p.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "e57005b1-7879-4155-b344-3722cf9e67fe",
                            "name": "Single ",
                            "description": "Room with bed 120-135 cm LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2w52m004c0uo5e3j2d4tp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2566,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2kqfn003m0uo5bi7pf2ep.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2w2yx004b0uo52oxi1od4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2l1h1003n0uo50c37bxsm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2w9at004e0uo512dnfsln.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2w76p004d0uo5221udbn0.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "bbbb1a17-381e-4228-9432-392bd4c3e86c",
                            "name": "Cathedral View Double Room for Single Use",
                            "description": "Room with two 105 cm beds or one double bed of 150 cm and views of the Cathedral, LCD TV, minibar, safe, free WIFI, air conditioning and heating.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 682,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2wwux004f0uo501ewh7ry.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2994,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2ncpb003o0uo5hbwl2wd8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2994,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2nlgw003p0uo5hyou4og6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 576,
                                    "url": "https://cdn.impala.travel/properties/ckna2x5fa004g0uo5ecbx709z.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "43123f27-9df3-4759-bafa-670e2738f5fb",
                            "name": "Sea View Double Room for Single Use",
                            "description": "Room with two 105 cm beds or one double bed of 150 cm and views of the bay, LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 576,
                                    "url": "https://cdn.impala.travel/properties/ckna2y2jr004j0uo54pmeh8vg.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3186,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna2oo2h003q0uo5dixt33dm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2y0uc004i0uo559875zv2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2xp9e004h0uo51uiu1nu1.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ddef99f6-3a97-4a13-8a65-f2862100df6b",
                            "name": "Double Bed Sea View",
                            "description": "Room with one double bed of 150 cm and views of the bay, LCD TV, minibar, safe, free WIFI, air conditioning and heating.\n\nRoom size: 35 m² approximately.\n\nDouble bed size: 150 cm.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2yggh004k0uo5hr8tcuum.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 600,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckna2yi3v004l0uo58tdffzjw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2yjrb004m0uo5fro45sya.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "cf6a5e56-8bf9-44a0-8615-b5f790e44dcc",
                            "name": "Sea View Double Room + Kid",
                            "description": "Room with one double bed of 150 cm and one extra bed for children, views of the bay, LCD TV, minibar, safe, free Wi-Fi, air conditioning and heating.\n\nRoom size: 35 m² approximately.\n\nDouble bed size: 150 cm.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 765,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2z2qd004n0uo5bo5e6xxr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna2z5o6004o0uo5dnugemn9.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "351d12df-dc79-49b0-ae2d-75fbd45edd40",
                    "name": "Hotel Hoyuela [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Hotel Hoyuela Santander was erected following the Cour Jardin style at the height of the splendour of Avenida de los Hoteles, where it’s located. Its classic and elegant design and modern facilities make this accommodation truly unique."
                    },
                    "phoneNumbers": [
                        "+34 942 28 26 28"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+351d12df-dc79-49b0-ae2d-75fbd45edd40@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2569,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckna1slvy002c0uo57k2g0d5v.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 650,
                            "width": 450,
                            "url": "https://cdn.impala.travel/properties/ckna1vz6d002q0uo58nu0fi0k.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1800,
                            "width": 1440,
                            "url": "https://cdn.impala.travel/properties/ckna1w220002r0uo5eslthn4y.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 700,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckna1w4cc002s0uo5gxa5gc4g.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 700,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckna1w60f002t0uo5h5f64e64.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 700,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckna1w7l0002u0uo52164cms9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 650,
                            "width": 450,
                            "url": "https://cdn.impala.travel/properties/ckna1w92m002v0uo5h88g9uz6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 650,
                            "width": 450,
                            "url": "https://cdn.impala.travel/properties/ckna1wahh002w0uo5e7tzfw4n.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1xmeg00300uo520ycch0a.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1xo4900310uo5786teo4y.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1xpn200320uo5e7hv0uta.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1xr8100330uo546vq96m4.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Avenida De Los Hoteles, 7",
                        "line2": null,
                        "city": "Santander",
                        "postalCode": "39005",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -3.7836764,
                        "latitude": 43.4718783
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 26,
                            "formatted": "Currency exchange"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 55,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T08:38:38.075Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "35c64c9e-156b-4eb8-8927-930dc3ab9073",
                            "name": "Twin Room",
                            "description": "This air-conditioned room has carpeted floors and classic-style décor. It features flat-screen satellite TV, free Wi-Fi and a minibar. The private bathroom includes a hairdryer, and free toiletries.\n2 single beds",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1o316001t0uo5fch7c8hn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2709,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1o9bu001u0uo55ddz8c42.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "cc577f0d-d627-4914-af51-2ce919d639d6",
                            "name": "Single Room",
                            "description": "This air-conditioned room has carpeted floors and classic-style décor. It features flat-screen satellite TV, free Wi-Fi and a minibar. The private bathroom includes a hairdryer, and free toiletries.\n1 single bed",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1okyh001v0uo57gh02929.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1or18001w0uo5atxp01rh.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "94c6eeae-938e-4b2a-b829-8026a3ba0665",
                            "name": "Junior Suite with Views",
                            "description": "This spacious, air-conditioned suite has carpeted floors and classic-style décor. It features a flat-screen satellite TV, free Wi-Fi and a minibar. The private bathroom includes a hairdryer, bathrobe, and free toiletries. This suite offers sea views.\n1 double bed (180cm)",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 682,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1v8ol002n0uo59o0oa324.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2559,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1pkkb001y0uo53q20eie9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2713,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1peau001x0uo5fbgj2m5w.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "bc7ffa80-7cf0-4d06-830b-ecf0fa4bd9b6",
                            "name": "Triple Room",
                            "description": "This air-conditioned room has carpeted floors and classic-style décor. It features flat-screen satellite TV, free Wi-Fi and a minibar. The private bathroom includes a hairdryer, and free toiletries.\n3 single beds",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1q3co001z0uo5b5ecarxs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2709,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1qful00210uo567en88fd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1q9pv00200uo56kgc3265.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "dc2a2b0a-ba99-4195-9df0-330de9d40ecb",
                            "name": "Double Room",
                            "description": "This air-conditioned room has carpeted floors and classic-style décor. It features flat-screen satellite TV, free Wi-Fi and a minibar. The private bathroom includes a hairdryer, and free toiletries.\n1 double bed (150cm)",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1qw4x00240uo56fth4i3i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckna1qpy100220uo50koa5mg1.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "43d4a831-71bf-41cf-8e6f-a8451d7cabbb",
                    "name": "Hotel Sardinero Madrid [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "The perfect balance between history and modernity.\n\nA historic building which has been renovated to include the most up-to-date facilities and the latest technology. The hotel is located in the emblematic Chamberí district and benefits from good connections with the rest of the city."
                    },
                    "phoneNumbers": [
                        "+34 912 06 21 60"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+43d4a831-71bf-41cf-8e6f-a8451d7cabbb@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1ru0j00270uo5hbjjep8l.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 843,
                            "width": 1254,
                            "url": "https://cdn.impala.travel/properties/ckna1qv1c00230uo5d4hc44im.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2529,
                            "width": 3763,
                            "url": "https://cdn.impala.travel/properties/ckna1r4ak00250uo54upsfq9r.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1980,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckna1rdjk00260uo51b176nzl.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1s0s100280uo58s78c4p9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1s8kl00290uo51qawblm5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1sg63002b0uo5a73f6nx0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1snyo002d0uo5erfn7gyv.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1sv2a002e0uo566p1hztx.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1swwl002f0uo53n7y4pcc.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckna1sycs002g0uo5fbd3730f.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 700,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckna1szjz002h0uo57ybm09bi.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Plaza Alonso Martínez, 3",
                        "line2": null,
                        "city": "Madrid",
                        "postalCode": "28004",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -3.6960664,
                        "latitude": 40.4281557
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 345,
                            "formatted": "Fitness Center"
                        }
                    ],
                    "roomCount": 63,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T08:35:51.595Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "1738a5bd-52d4-4e93-862e-363c136db72e",
                            "name": "Tower Suite",
                            "description": "This unique suite occupies two floors of the mansion’s tower below the dome. The lower floor consists of a spacious bedroom with a double bed and the upper floor offers an additional space comprising a relaxation area, lounge and sofa. The charm of this space is complemented by furnishings by the furniture company Kenzo and décor by Celia Gómez. The bathroom includes a spacious rainfall shower for your complete relaxation.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1tz6b002j0uo5czg5b7w5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/area-types/ckna42zw100013b6bled0k3sl.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1tqkn002i0uo56zp4909z.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "51659710-89c9-4e32-92cf-f493759e9ff9",
                            "name": "Premium",
                            "description": "Bright, fully soundproofed room with exterior views. It comes equipped with a double bed, Kenzo furniture and a lounge area. The design by Celia Gómez Decoración respects the palatial charm of the building and transforms each room into a welcoming and unique space. The bathroom includes a spacious rainfall shower.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1924,
                                    "width": 2923,
                                    "url": "https://cdn.impala.travel/properties/ckna1uofh002k0uo5gjsc9wln.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1vayw002p0uo551n79y49.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1925,
                                    "width": 2923,
                                    "url": "https://cdn.impala.travel/properties/ckna1uwd6002l0uo527u945h0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1v1ji002m0uo5eba84nwc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1v9o6002o0uo53rxb3w1o.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "c535f0a6-1904-4609-ad28-b5d52ec6d229",
                            "name": "Deluxe",
                            "description": "Bright, fully soundproofed room with exterior views. It comes equipped with a double bed and Kenzo furniture. The design by Celia Gómez Decoración respects the palatial charm of the building and transforms each room into a welcoming and unique space. The bathroom includes a spacious rainfall shower for your complete relaxation.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 92,
                                    "formatted": "Safe"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1wi8w002x0uo5agpr94dz.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "1e938e01-6cb9-4360-8c3f-bed1e049b0f8",
                            "name": "Standard",
                            "description": "Room facing the mansion’s interior patio and benefitting from lots of natural light. Guests can choose between a double bed or two single beds for their complete comfort. All rooms have been designed by Celia Gómez. The décor includes exclusive furnishings by the furniture company Kenzo. These rooms are noted for being functional, peaceful and cosy. The bathroom includes a spacious rainfall shower for your complete relaxation.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1xfdv002z0uo59rryhe5m.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckna1x7pl002y0uo5bg69dnvl.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "0a809629-a2b4-454f-ba41-340b57747c40",
                    "name": "Dolomeet Boutique Hotel [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Surrounded by the untouched nature of the Dolomites, in the centre of Pinzolo, away from traffic and not far from Madonna di Campiglio and the ski lifts, the Dolomeet Boutique Hotel is a unique place full of peace and harmony that will give you an exclusive holiday you will not forget."
                    },
                    "phoneNumbers": [
                        "+39 0465 503 902"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+0a809629-a2b4-454f-ba41-340b57747c40@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0qaxj001s0uo58q800aux.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pm3z001i0uo58n9dbyyt.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pomo001j0uo5gp80dqji.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pqnj001k0uo5eg152g4e.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pt6a001l0uo5cji172fd.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pvzj001m0uo5h6q131z2.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0pyki001n0uo56luw3sg3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0q12z001o0uo51z8wcs7b.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0q3q0001p0uo570xx4ib9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1100,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckna0q608001q0uo57knzasj3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 950,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckna0q89e001r0uo59cymha3p.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Str. Collini Borciol, 16",
                        "line2": null,
                        "city": "Pinzolo  ",
                        "postalCode": "38086",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 10.7665433,
                        "latitude": 46.1606178
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 79,
                            "formatted": "Sauna"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 84,
                            "formatted": "Spa"
                        },
                        {
                            "code": 130,
                            "formatted": "Body scrub"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 21,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-09T08:04:21.401Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "87eaf607-2500-4676-b11e-85935fcf74e1",
                            "name": "Suite Boutique",
                            "description": "40 m² + 10 m² balcony  -  max: 4 pers.\nStyle, personality, brightness. The BOUTIQUE SUITE is on the third floor, is west facing and consists of two different areas separated by a sliding glass door. Both the bedroom and living area lead out on to spacious larch terraces, offering stunning views of the surrounding mountains. The bathroom boasts a large shower equipped with LED lighting; the toilet with bidet is separate. The BOUTIQUE Suite is the ideal option for the more discerning guest who is seeking sophisticated details, generous spaces and exceptional views.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckn93bicw000n0uo5f7klhot5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn935xpf000j0uo569zm1jqi.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn935pri000i0uo57192gpnx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn9379kr000m0uo5ej7a200o.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ba67ce55-0294-441d-a48f-67bc9146c5e6",
                            "name": "Alpine Deluxe ",
                            "description": "30 m² + 25 m² solarium - max: 2 pers. \nThe ALPINE DELUXE room, on the first floor, is spacious, bright and south facing. It has its own fully-equipped solarium, an exclusive private space where guests can sunbathe undisturbed and relax in complete peace and quiet, making this room the only one of its kind. The room has a walk-in wardrobe, bathroom with separate toilet and bidet and spacious shower with LED light. Its features make this room a particularly suitable option for couples.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0ajiu000p0uo5enow4sdy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0am3q000q0uo54lvdagfq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0agub000o0uo5ebrtc4w5.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "6885a0d4-4748-4544-af9b-44c8d148bdcf",
                            "name": "Charme Suite",
                            "description": "35 m² + 50 m² solarium  -  max: 4 pers.\nThe CHARME SUITE is on the first floor, is south facing and consists of two separate areas: a living area with a sofa bed, and a bedroom, leading out to a spacious private solarium, equipped with lounger and seats, making these spaces exclusive and exceptional. The room has a walk-in wardrobe, bathroom with separate toilet and bidet, and shower with LED light.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0busw000s0uo5b8w31vzt.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0bzqt000u0uo53o17e9ls.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0bxkg000t0uo5aabm3g05.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "dea09f15-9300-45e4-8eb4-4515b6822c3b",
                            "name": "Mountain Suite",
                            "description": "36 m² + balcony - max: 4 pers. The MOUNTAIN SUITE is on the second or third floor and consists of two separate areas: the living area and the bedroom, on a south-facing terrace. The generous spaces and the refined details will satisfy the most discerning of guests. ALLERGY FREE HOTEL Facilities: HD LED TV Dual sky connection Wi-Fi minibar safe telephone makeup mirror hairdryer kettle wellness kit: bag containing bathrobes, towels and slippers",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0ei1z000x0uo5hq77fimz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/properties/ckna0efur000w0uo5aqso7udz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0edco000v0uo58ijv4tj4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0ekte000y0uo5bbxz5lxq.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "fb149c5e-e222-4fca-8aa3-40809d91b148",
                            "name": "Room Nature",
                            "description": "22 m² - max: 2 pers. \nThe oak flooring and the meticulous attention to detail give this room a welcoming atmosphere, making guests feel truly at home. ALLERGY FREE HOTEL Facilities: HD LED TV Sky Wi-Fi minibar safe telephone makeup mirror hairdryer kettle wellness kit: bag containing bathrobes, towels and slipperss.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0h7m300100uo59aic67ov.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/properties/ckna0h9la00110uo5dixk44p1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 800,
                                    "url": "https://cdn.impala.travel/properties/ckna0hdxo00120uo5fzgufve6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0h4gl000z0uo5a21a1lod.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "16bef602-c26e-44bd-8aac-dda8ed6baae4",
                            "name": "Wood Wood",
                            "description": "22 m² + 5 m² balcony - max: 2 pers. \nThe bright and sunny WOOD room has a balcony, offering unobstructed views of the surrounding mountains. The room has oak flooring and the backlit images of mountains on the walls give guests a preview of the natural spectacle that awaits them, at the same time inviting them to relax and enjoy the peaceful atmosphere. Some rooms have a walk-in wardrobe and bathroom with separate toilet and bidet. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0jj2n00130uo5anfaeku7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0jro700140uo5gk9jg8uo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0k00700150uo5fhya0txq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0kup200160uo5cpjigccc.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "48d7ced4-a7ee-4dd4-9e33-6778ec478960",
                            "name": "Dolomeet Junior Suite",
                            "description": "32 m² + 4 m² balcony - max: 4 pers. \nA modern, refined and welcoming atmosphere. The warm colours of the fabrics in the DOLOMEET JUNIOR SUITE contrast beautifully with the simplicity of the burnished steel, whilst the glass balcony invites you to gaze leisurely at the beautiful natural surroundings. The room is equipped with a walk-in wardrobe, a sofa bed, bathroom with separate toilet and bidet, spacious shower with LED light. The internal layout of this room makes it particularly comfortable and suitable for families.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0lvzq001c0uo5ba52h5e0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0lr9g001a0uo546nk9t58.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0lp0p00190uo5hpv58daa.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0lmht00180uo567ag9thm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0ltr7001b0uo5ht7ke0f3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0lk3c00170uo5bdxb89iw.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "8140c5c4-725d-4b38-9599-4fe609e54ea9",
                            "name": "Dolomeet Junior Suite",
                            "description": "32 m² + 4 m² balcony - max: 3 pers. \nA modern, refined and welcoming atmosphere. The warm colours of the fabrics in the DOLOMEET JUNIOR SUITE contrast beautifully with the simplicity of the burnished steel, whilst the glass balcony invites you to gaze leisurely at the beautiful natural surroundings. The room is equipped with a walk-in wardrobe, a sofa bed, bathroom with separate toilet and bidet, spacious shower with LED light. The internal layout of this room makes it particularly comfortable and suitable for families. ",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0ozg2001g0uo50evz01su.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0owuk001f0uo5a8jwb27z.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0n72o001e0uo5108u2bp8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0mdmh001d0uo50qy6abhv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1100,
                                    "width": 1800,
                                    "url": "https://cdn.impala.travel/properties/ckna0p210001h0uo57lbhgmhj.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "eb291aed-dc30-4ff5-a952-dd6666a1596b",
                    "name": "Aegean Village Beachfront Resort  [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Located just above a secluded beach, Kastelia in Karpathos, Aegean Village Beachfront Resort features a buffet breakfast, restaurant and pool bar. "
                    },
                    "phoneNumbers": [
                        "+30 2245 081195"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+eb291aed-dc30-4ff5-a952-dd6666a1596b@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 512,
                            "width": 1275,
                            "url": "https://cdn.impala.travel/properties/ckn91kn80013v0snngsnf3x4x.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn91jjnk013n0snnevy45i8x.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn91joiu013o0snn4hg5g9wh.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1024,
                            "width": 683,
                            "url": "https://cdn.impala.travel/properties/ckn91jsfm013p0snn27y72p3j.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91jwio013q0snnegsgc0vr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 805,
                            "width": 1411,
                            "url": "https://cdn.impala.travel/properties/ckn91k1uc013r0snn6x3n8l27.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 935,
                            "width": 1717,
                            "url": "https://cdn.impala.travel/properties/ckn91k7zy013s0snn3nf0dii3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn91kczr013t0snn363g9fa0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn91kieb013u0snn3v5s596a.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91ks56013w0snnhwb6gcus.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91kw6g013x0snn2o5ecce6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91l085013y0snncr3p2md2.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91l4rs013z0snn7eb6azo1.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 680,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91l98i01400snn0dfuhhnu.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn91ldjp01410snnhwdr7640.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn91lhqv01420snn6tz6crtp.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Amoopi",
                        "line2": null,
                        "city": "Amoopi",
                        "postalCode": "857 00",
                        "region": null,
                        "country": "GRC",
                        "countryName": "Greece"
                    },
                    "location": {
                        "longitude": 27.1926833,
                        "latitude": 35.4723993
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 36,
                            "formatted": "Express check-in"
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 96,
                            "formatted": "Dry cleaning"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 122,
                            "formatted": "Shops and commercial services"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 168,
                            "formatted": "Onsite laundry"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 230,
                            "formatted": "Secured parking"
                        },
                        {
                            "code": 239,
                            "formatted": "Beachfront"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 37,
                            "formatted": "Express check-out"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 52,
                    "checkIn": {
                        "from": "14:00",
                        "to": "23:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T15:59:57.891Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "43a3fdf1-255e-47aa-b3eb-692295e337ac",
                            "name": "Executive Suite",
                            "description": "Step into the contemporary elegance of an open flow room that opens out to a private balcony with a Jacuzzi and endless views over the Aegean Sea. Every single detail aims to relax the mind of our distinctive guests. Interior lighting, open wardrobes, floating shelves and minimal curtains all play to the power of pure white.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 245,
                                    "formatted": "Private pool"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91qer401490snn9rk5h4gi.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91qnym014b0snnakpvb0l7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91pr7001440snn5l0a1rrs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91pw2i01450snn14vm0hd6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91q0vm01460snn6lrkcjaq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91q5ac01470snnbkexh8is.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91q9yk01480snn8jj5d2ml.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91qjf4014a0snn6s8z5j2p.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91qtb0014c0snnam5r2cdi.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91qxld014d0snn9fcg71ke.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91pm1w01430snnba7c0vht.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "e2842e34-5197-4fc9-bddb-ac13d7dda71c",
                            "name": "Standard Room",
                            "description": "Step into the modern comfort of an open flow room that opens out to a balcony or a terrace with endless views over the Aegean sea.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91xxe700010uo5d28q3f89.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91xsop00000uo58vckhvlr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91y23h00020uo5blxxfeqf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91y60c00030uo57fjy5cgf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn91yat600040uo5905uczr2.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "158b886c-f0ea-4072-b263-e239068910ca",
                            "name": "Superior Room",
                            "description": "Step into the contemporary elegance of an open flow room, inspired by the traditional Karpathian stype, opens out to a private balcony or a terrace with endless views over the Aegean Sea.\nEvery single detail aims to relax the mind of our distinctive guests. Interior lighting, open wardrobes, floating shelves and minimal curtains all play to the power of pure white.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn924xik000a0uo5f7al1m5i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn922xbl00050uo54ra9gdio.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn923p1v00060uo57i7n1gms.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn923ycs00070uo5awm30lw3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn924b8f00080uo50hi30k5u.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn924scj00090uo5bkqlfpwc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn9252ko000b0uo5756e057g.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn9257o7000c0uo5g0k3db4x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn925c9z000d0uo5aef97a8s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn925h51000e0uo55ng46rrb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn925m08000f0uo50bnb2qy4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn925qmt000g0uo52gdce0we.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1800,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn925vhg000h0uo52wuu9yu5.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "9d00ef07-543b-4ebc-829f-fdaca5c3275c",
                    "name": "Hotel AS Hotels Altube [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 2,
                    "description": {
                        "short": "At km 36 of the AP-68, on their way through Zuia, Álava, is the AS Hotels Altube , a nice and cozy 2 star hotel 20 km from Vitoria and 40 Bilbao ideal for travelers en route for leisure or business in the Basque Country. The place has 20 rooms bright, with attention to every detail and equipped with all facilities you need to have a pleasant and carefree. "
                    },
                    "phoneNumbers": [
                        "+34 945430173"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+9d00ef07-543b-4ebc-829f-fdaca5c3275c@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90rs9u01320snnbzbdghcp.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90r5j5012z0snncfnt5mej.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 732,
                            "url": "https://cdn.impala.travel/properties/ckn90re0901300snnde7mbhop.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90rldr01310snn7aid8p8m.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 533,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90rzao01330snn7i06duu9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90sjjp01340snn4cswem9r.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90sn4h01350snn0fix34t1.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn90swyq01360snn59zq6jk8.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Autopista Ap-68 Km 36",
                        "line2": null,
                        "city": "Vitoria-Gasteiz",
                        "postalCode": "01013",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -2.869599,
                        "latitude": 42.96659
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 122,
                            "formatted": "Shops and commercial services"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 20,
                    "checkIn": {
                        "from": "12:00",
                        "to": "00:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T15:20:10.051Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "203db2cb-0d00-491a-970f-df41ff625817",
                            "name": "Double Room",
                            "description": "The AS Hotels Altube have double rooms, all rooms have a desk, air conditioning and heating and free WIFI Internet. If you want you can add a cot for the youngest of the family.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 480,
                                    "width": 760,
                                    "url": "https://cdn.impala.travel/properties/ckn90tdat01380snnbkns74xg.png"
                                },
                                {
                                    "altText": null,
                                    "height": 480,
                                    "width": 760,
                                    "url": "https://cdn.impala.travel/properties/ckn90ta4t01370snn65jrbr0h.png"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "367cdb50-5921-4ee3-9fe1-d7c343cd17e0",
                            "name": "Triple Room (2 Adults + 1 Child)",
                            "description": "At Hotel As Express Altube all triple rooms (2 adults + child) provide a comfortable and quiet place to enjoy a memorable family vacation.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 480,
                                    "width": 760,
                                    "url": "https://cdn.impala.travel/properties/ckn90ult101390snnbzekcmz2.png"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "b2187b32-ee77-4b8f-94e1-3040e3f30840",
                            "name": "Triple Room (3 Adults)",
                            "description": "The AS Hotels Altube have room for three people, equipped with a comfortable desk, air conditioning and heating and free wireless Internet. Whether traveling for business or family in this hotel you will find the perfect break.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 480,
                                    "width": 760,
                                    "url": "https://cdn.impala.travel/properties/ckn90v220013a0snnh34sg2m4.png"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "6ba6ee9d-23be-4587-86ca-59478456a6aa",
                    "name": "Hotel Porta Faenza [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 3,
                    "description": {
                        "short": "The Hotel Porta Faenza is centrally located, very close to the main railway station (Santa Maria Novella), to Palazzo dei Congressi (the Conference Centre) and to the Fortezza da Basso. The most interesting monuments and museums in Florence are within easy walking distance.\n\nThe Hotel will make you savour the warm atmosphere of the old-time Florentine houses: the tile floor, the exposed beams, the old tools scattered everywhere, together with all the comforts will make it your ideal home in the old Florence.\n\nFor being situated in a pedestrian precinct, the Hotel is a quiet and pleasant place, the ideal point of departure for you to discover Florence and its artistic and cultural life."
                    },
                    "phoneNumbers": [
                        "+39 055 217975"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+6ba6ee9d-23be-4587-86ca-59478456a6aa@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1063,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90ws1w013c0snnhld7cbgb.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn90fnk0012q0snn99w6ernz.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90fzau012r0snn1c8t1ln6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90gdld012s0snnf18ofb58.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90gp77012t0snndn1b57zr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90h3ey012u0snn6ca7ecg5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90hk23012v0snn5whhbhmk.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90i2i3012w0snnf3f361zb.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90iqg2012x0snndvzc0nw4.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1913,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn90jdov012y0snn87553e3i.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1067,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90wp9o013b0snn4y3m91gs.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1063,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90x134013d0snncv8pho78.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1063,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90x8r2013e0snn5w2pbbr0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1000,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90xft7013f0snn98qpaht0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1063,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90xoe9013g0snn1yh659xw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1063,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn90xwqc013h0snn1d3rgrvl.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Via Faenza, 77n",
                        "line2": null,
                        "city": "Florence",
                        "postalCode": "50123",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 11.2509597,
                        "latitude": 43.7778977
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 36,
                            "formatted": "Express check-in"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 269,
                            "formatted": "Meeting rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 37,
                            "formatted": "Express check-out"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 24,
                    "checkIn": {
                        "from": "13:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T15:19:57.792Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "9c21f773-83da-4130-aa50-06c3888a90fb",
                            "name": "Single Room",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2560,
                                    "url": "https://cdn.impala.travel/properties/ckn8zzfh6012a0snn97vnc7xr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn9009c2012c0snn83cph1vr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn8zzu9v012b0snngnwr77nm.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "832f067a-84ea-4982-b080-8c8ed358f22a",
                            "name": "Quadruple Room",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn902x09012i0snn8n5n1ynr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn9023pb012g0snn7ykth9zr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn900vt4012d0snnc9no0jim.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn901ajt012e0snn5tbs55j3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn901roo012f0snn8knq213x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn902hks012h0snne0j395mj.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "f5590aac-14f1-4b74-b431-e6fc8a611f50",
                            "name": "Quintuple Room",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 5,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn8zeomu011f0snneudi3dnd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zfz61011k0snnhlxd9xon.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zfi3o011i0snn68noh6y8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zf9cf011h0snngjkj0r8m.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zexyj011g0snn61l4bfaj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zfqpf011j0snn6zbjh3g5.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "060c20cf-0149-4ace-8b5d-9d090b4ae558",
                            "name": "Double Room Economy",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zhvnm011p0snn5971gs3q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn8zgqmb011l0snnab996592.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zh02e011m0snnahrm8c2x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zhb5w011n0snnestm2bf8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zhksp011o0snn4hf82sgu.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "7897a9b7-fce6-458e-b62a-1cabdbaed7f7",
                            "name": "Double Room",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zq4eo01200snn2iyn0hty.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zor8s011x0snnc4do5eik.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zp12d011y0snn6mnn7wad.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn8znxd6011u0snn1l0t4iw1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2559,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zo7ni011v0snngl2maedu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zogvc011w0snnge1ser21.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2663,
                                    "url": "https://cdn.impala.travel/properties/ckn8zqohr01210snnes3agp8s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zphir011z0snnbgkba8tv.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "fb808b34-b5cc-47e0-815f-e0f8625ea923",
                            "name": "Triple Room",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ztoei01270snn4izu45mn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zt3bi01260snn76ifg41i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8zs5dj01240snn164m15xf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zsn8y01250snn2frla6s9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn8zrnsf01230snnhtnj3uez.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zuvnx01290snn5mz8hzp4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8zu86q01280snn25n22xw6.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "fd6ac06a-c6d8-450f-9e85-3e0807ddc305",
                            "name": "Double Room Superior",
                            "description": "Services: free  wi-fi, safe, air conditioning, desk, heating, parquet or wooden floor, hairdryer, complimentary toiletries, bathtub or shower, telephone, satellite channels, flat-screen TV, minibar, wake-up call ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1913,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn90fajd012p0snn9wpt0nf7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2635,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn90dnlp012k0snn141x8zjv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2764,
                                    "url": "https://cdn.impala.travel/properties/ckn90ddcq012j0snn36iecwrr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2559,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn90e9rx012m0snnbsc1c0dl.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn90elko012n0snnfv78hs6o.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2560,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn90ey7q012o0snn3wqaf39b.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn90dy39012l0snnawka4ou4.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "c2619474-ffe8-4059-b961-da85f0cd268e",
                    "name": "Eastbourne Riviera Hotel [SANDBOX]",
                    "currency": "GBP",
                    "starRating": 3,
                    "description": {
                        "short": "Eastbourne Riviera Hotel offers a friendly atmosphere and comfortable accommodation on Eastbourne's elegant seafront.\n\nEastbourne Riviera Hotel is within easy reach of the Victorian Pier, Eastbourne centre, theatres, Eastbourne Conference Centre, Eastbourne International Tennis Centre, golf clubs and the beautiful South Downs national park countryside."
                    },
                    "phoneNumbers": [
                        "+44 (0) 1323 430 302"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+c2619474-ffe8-4059-b961-da85f0cd268e@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yq923010s0snn6xdo1f5q.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8ygt9v01000snn86kv5sfq.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3840,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yh20f01020snndajn9g0k.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yhc3901040snnf9u9hjg9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yhlq501060snnd547gxx0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yhwuo01070snn8imjeibn.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8yiai201090snn1prx8wgv.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8yipwf010a0snnbvr0e37w.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yj8gr010c0snn1ow0dngn.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yju7v010d0snn4awmg993.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8ykjd3010g0snn9bmve39y.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8ylcy4010h0snn8ro72mp8.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3840,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8ymcjs010k0snn1hcu96ud.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3840,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yni3m010m0snnahm5e8mw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2160,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8yp254010q0snn4wfrdg7t.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "26 Marine Parade",
                        "line2": null,
                        "city": "Eastbourne",
                        "postalCode": "BN22 7AY",
                        "region": null,
                        "country": "GBR",
                        "countryName": "United Kingdom of Great Britain and Northern Ireland"
                    },
                    "location": {
                        "longitude": 0.294831,
                        "latitude": 50.769469
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 239,
                            "formatted": "Beachfront"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 36,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T14:49:21.742Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "11b17fb3-ac25-4a0c-b8bc-3c245186932c",
                            "name": "Family (2 Adults + 2 Children)",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8zrgkg01220snn2fudarho.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yarkd00zo0snnesrkapml.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "9b040d8a-5906-4fc1-bc69-7971686c492a",
                            "name": "Family (2 Adults + 1 Child)",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8y5k1b00z70snng0kp7v6z.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 576,
                                    "url": "https://cdn.impala.travel/properties/ckn8zjupm011q0snnazv2hjsz.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "c06dce22-e2d2-4dc2-8de2-f0a617e36bf8",
                            "name": "Twin Room",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8y5nfb00z80snn84408j5j.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y5ts000z90snn719mfrvw.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "5b281255-24b3-4651-96f7-6c229c9ebf8d",
                            "name": "Single Room Sea View",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8yb23z00zp0snnex5m125j.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8y60n700za0snn31gxdalx.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "d5d9a5cb-d49d-4191-81b4-f6307c5a0889",
                            "name": "Single Room",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y67yw00zc0snnh2s26j8t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8zm264011r0snn5h5e011o.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "d244d7b8-f8d7-4af7-8bde-469bf1eb5656",
                            "name": "Family Sea View (2 Adults + 1 Child )",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8y7egf00zd0snn9q5u60ql.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8zmcej011s0snn7goed2a4.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "3524794f-2848-45aa-8cf6-a4ba8776a5f8",
                            "name": "Sea View Double or Twin Room",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8y87fx00zf0snn2d556wnh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8zmqrg011t0snneaf16z0b.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8y7z9600ze0snnfgiwg0og.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "10ee5fe2-0e70-4b39-aacf-57bcb2f3cc29",
                            "name": "Double Room",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access  ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y966l00zh0snn52d8fp81.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y9aae00zi0snn5zcb3swo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y90o100zg0snn9au5eds7.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "0081b50f-1c55-4f9e-a243-5523430fc984",
                            "name": "Budget Double Room without Window",
                            "description": "Flat screen TV\nPrivate Bathroom  \nTea and coffee maker \nFree Wi-Fi access",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8y9n1700zj0snn79gchcrh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 2160,
                                    "url": "https://cdn.impala.travel/properties/ckn8y9t3v00zl0snngz7a54xz.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "bcdf03c6-1133-4c27-8749-ca668a2502c9",
                    "name": "Hotel Jane Firenze  [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 3,
                    "description": {
                        "short": "Situated near the historical city center of Florence, Hotel Jane welcomes its guests in style and original elegance."
                    },
                    "phoneNumbers": [
                        "+39 3273167555"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+bcdf03c6-1133-4c27-8749-ca668a2502c9@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z9mt6011d0snne60y3t0m.webp",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z724l01100snn751k8b8f.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z78t601110snne9la35vo.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2159,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8z7hof01120snn0zq4dmpm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 720,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckn8z7odm01130snn8in7eglg.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z7tzh01140snn9tsn41qa.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2604,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8z81q001150snne2xx2g72.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2159,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8z8d0l01160snn4kkt4vck.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z8kxo01170snn1n3fewsc.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1918,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z8qa501180snn70jc6oew.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z8w6y01190snn5vjzbj9x.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1923,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z92ue011a0snn52hu19fi.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1918,
                            "width": 2880,
                            "url": "https://cdn.impala.travel/properties/ckn8z98j2011b0snn1sg2cul9.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2159,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8z9fru011c0snn214w44fd.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1011,
                            "width": 1900,
                            "url": "https://cdn.impala.travel/properties/ckn8z9s84011e0snn0dpbdu9x.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Via Orcagna 56-58 ",
                        "line2": null,
                        "city": "Florence",
                        "postalCode": "50121 ",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 11.2749673,
                        "latitude": 43.769386
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 230,
                            "formatted": "Secured parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 24,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T14:47:46.965Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "5b08f768-5849-46fa-841a-bd31c191bbf6",
                            "name": "Single Room",
                            "description": "Single room with bathroom with shower and hairdryer, Internet, satellite TV telephone safe minibar and air conditioning.",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8y9qkl00zk0snn2lau1s54.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ybutt00zs0snn1pa71m0d.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ybkr200zr0snn6ck9a4hg.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yb3u700zq0snn4d572g55.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8ya3ru00zn0snnebsb2pao.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2564,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8y9xi300zm0snngxjbg939.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ca8c31fa-229d-4939-95e7-6b40a62909ee",
                            "name": "Double Room",
                            "description": "Double Room with double bed or twin bed, bathroom with shower and hairdryer, Internet, satellite TV, minibar, safe and air conditioning.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8yexs800zy0snn7dhw4u7o.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 575,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8yeeaw00zw0snn55mr7mh6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 720,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ydm8h00zv0snna9ykbq63.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 720,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ycmao00zt0snn0vbj6z8p.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 720,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8yd1ct00zu0snn1n5125i4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8yemvf00zx0snnc9w31d7a.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "f0e12166-badc-4bb0-b77d-00bf2d68f009",
                            "name": "Triple Room",
                            "description": "Triple room with three beds, bathroom with shower and hairdryer, Wi-fi internet, satellite TV, telephone, minibar, safe and air conditioning.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2149,
                                    "width": 3821,
                                    "url": "https://cdn.impala.travel/properties/ckn8yhk5j01050snn5r9zbz8i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ygy6c01010snn17297t5n.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8ygnw300zz0snn96lpds2r.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8yi7ch01080snn9geg03t0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yh85s01030snndjhsftlv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yiry5010b0snnd08v8l7x.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "cbae21fa-7d1d-4d5c-9966-49bf7770278c",
                            "name": "Economy Double Room",
                            "description": "Economy Double room with French bed, bathroom with shower and hairdryer, satellite TV, WI-FI intenet, telephone, minibar, safe and air conditioning.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2564,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yk87h010f0snngire2ah0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ylhlk010i0snna4uzas9t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8ym0cl010j0snngnx8der1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ymksh010l0snn3lqg324r.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yjv86010e0snn2s0l6oeb.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "e6b83599-442a-48aa-b5c6-987f23cd0d31",
                            "name": "Quadruple Room",
                            "description": "Quadruple room with four beds, bathroom with shower and hairdryer, satellite TV, WI-FI internet, minibar, telephone, safe and air conditioning.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yq9oc010t0snnf0z9fh8q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yo3bz010n0snn7zpb6sao.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yogbm010o0snng5y569r4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yow69010p0snndeiyfemp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ypndi010r0snnhl9i772f.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "83974cb2-214e-434f-a289-dc5b50ac632f",
                            "name": "Twin Room",
                            "description": "Twin bed, bathroom with shower and hairdryer, Internet, satellite TV, minibar, safe and air conditioning.\nPlease, specify which kind of bed you prefer in the Special Request",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yxbv2010x0snn6ck553hu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yzcth010z0snncr8fgz16.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2314,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yrekr010u0snn59jzgxlu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yrxma010v0snn1qqr2uls.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1923,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8yst9s010w0snn5c6a9qzb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2159,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8yyhyr010y0snn9hfi7cby.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "cf6a83b1-2fe3-4037-8e6a-e4c830d6a58d",
                    "name": "Hotel La Favorita Mantova [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Hotel La Favorita has been designed to satisfy all your needs. Enjoy the Michelin rated restaurant with traditional Mantua cuisine then relax in one of our 4 star rooms full of additional features."
                    },
                    "phoneNumbers": [
                        "+39 0376254711"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+cf6a83b1-2fe3-4037-8e6a-e4c830d6a58d@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2118,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wzjcw00z00snnhdlr9t7l.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wy06n00yv0snn50x5034j.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wyoux00yw0snn5bh19uwg.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wyw9b00yx0snnbpr97d8e.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wz37300yy0snnagz2d9p9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wzaqw00yz0snn0s0n6zji.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8wzt0300z10snnaaxbb6zw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8x064r00z20snn9zpf3xlc.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8x0irm00z30snndyvc5sc0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2002,
                            "width": 3000,
                            "url": "https://cdn.impala.travel/properties/ckn8x0w9u00z40snn4fm6301h.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Via S. Cognetti De Martiis, 1",
                        "line2": null,
                        "city": "Mantova",
                        "postalCode": "46100",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 10.8289095,
                        "latitude": 45.1659566
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 122,
                            "formatted": "Shops and commercial services"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 269,
                            "formatted": "Meeting rooms"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 93,
                    "checkIn": {
                        "from": "14:00",
                        "to": "00:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T13:33:15.169Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "ad9fc712-abcd-4896-87bb-dc1722c91971",
                            "name": "Superior Room",
                            "description": "Room of   21 Sq m with double bed or two single beds and big balcony or gym exerciser TECHNOGYM:\n\n·  TV LCD -  Mediaset Premium Free  \n·  Minibar\n·  Desk with LAN cable (on payment)\n·  Telephone\n·  Safe\n·  Big balcony with garden view or Gym exerciser TECHNOGYM -  Pectoral Machine/Ellyptical Exerciser/Exercise bike/Treadmill\n·  Parquet floor\n·  Beds with hypoallergenic duvet\n·  Modern furniture of contemporary design\n·  Shower 140 x 80  with a big rainfall showerhead!\n·  Towel warmer",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wvhb400yu0snn6qzp9i1y.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wv1u900ys0snnfzouacpw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wvavl00yt0snn9ycy7sbk.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "bf4bef71-16ba-45a8-87a1-521d6b04f581",
                            "name": "Gransonno Room",
                            "description": " Room of 21 Sq m with double bed or two single beds:\n· TV LCD - Mediaset Premium Free   \n· Minibar\n· Desk for work with LAN cable (on payment)\n· Telephone\n· Safe\n· Parquet floor\n· Beds with hypoallergenic duvet\n· Modern furniture of contemporary design\n· Shower 140 x 80   with a big rainfall showerhead!\n· Towel warmer\n· Hair drier",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wrbto00yf0snn14tn8mge.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wrijb00yg0snn4xim8y2c.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wrp0700yh0snnhh800wr5.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "d6b96117-54bc-4f54-9660-1b94bb9d88cf",
                            "name": "Business Suite",
                            "description": "Room of 34 Sq m   with double bed, living area with sofa, double bathroom with Whirlpool bathtub and big bow window:\n· TV LCD - Mediaset Premium Free   \n· Kettle for Coffee & Tee\n· Minibar Free\n· Double area (bedroom and living area)\n· Sofa i n the living area\n· Parquet floor\n· Beds with hypoallergenic duvet\n· Modern furniture of contemporary design\n· Double bathroom\n· Whirpool Bathtub\n· Shower 140 x 80 with a big rainfall showerhead!\n· Wellness Kit with bathrobe, slippers and courtesy kit PLUS\n· Towel warmer\n· Desk with LAN cable (on payment)\n· Telephone\n· Safe\n· Free garage",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 667,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8x4jc900z60snnak0vfn9s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wu6dk00yr0snn4et7cxen.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 667,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8x4gm700z50snn72qz721k.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "7da1acf9-4a70-49cf-8a21-f5f8bd5b9b1f",
                            "name": "Basic Single Room",
                            "description": "Room of 18 Sq m with a three quarter bed\n\n· TV LCD - Mediaset Premium Free   \n· Minibar\n· Desk for work with LAN cable (on payment)\n· Telephone\n· Safe\n· Parquet floor\n· Beds with hypoallergenic duvet\n· Modern furniture of contemporary design\n· Shower 140 x 80   with a big rainfall showerhead!\n· Towel warmer",
                            "maxOccupancy": 1,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wtr7i00yq0snn2eelalf4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2160,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8wt8xm00yn0snn5fi3b2f6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wtezk00yo0snnbrilah6i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wtl2f00yp0snnbkg9cqww.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "9b50896d-d564-4c13-8806-33baeb93ad5b",
                            "name": "Deluxe + 2 Extra Beds ",
                            "description": "Room of 32 Sq m  with double bed or two single beds and living room area with sofa :\n\n· TV LCD - Mediaset Premium Free  \n· Kettle for Coffee & Tea\n· Minibar  \n· Desk with LAN Cable (on payment)\n· Telephone\n· Safe\n· Sofa bed single or double\n· Parquet floor\n· Beds with hypoallergenic duvet\n· Modern furniture with a contemporary design\n· Shower 140 x 80 with big rainfall showerhead!\n· Towel warmer",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8ws66d00yj0snn0t0g3mz0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wsgfj00yk0snn5lrjf25n.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wsmo600yl0snn356phw20.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wssm500ym0snnawvkc0ej.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2002,
                                    "width": 3000,
                                    "url": "https://cdn.impala.travel/properties/ckn8wrzsx00yi0snnawb335zx.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "b5ffb8a8-b71b-4496-875a-2e263be4fe99",
                    "name": "Hotel Diamante in Alessandria [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Hospitality and elegance, dedicated to you.\n\nAt the Hotel Diamante in Alessandria you will find bright rooms and thoughtful and helpful service. Well connected to the centre of Alessandria and easy to reach from the motorway, the Diamante is designed to make your wishes come true."
                    },
                    "phoneNumbers": [
                        "+39 0131 611111"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+b5ffb8a8-b71b-4496-875a-2e263be4fe99@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2283,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v635n00xy0snne20r6i5r.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uw25f00xj0snn6z69567a.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1979,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uwbel00xk0snn3od6bmn2.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uwnr500xl0snn5f339a0i.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uwx3i00xm0snn8zwg1xqf.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8ux9cp00xn0snn5kgw8mbi.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uxns200xo0snn87xgee3m.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8uzvx800xp0snn2f1o84z3.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v02xg00xq0snnhdx1dm4i.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3763,
                            "width": 2510,
                            "url": "https://cdn.impala.travel/properties/ckn8v09gw00xr0snn42bb6oo2.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v0jx600xs0snn7kxe9sho.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v0u1o00xt0snn877w1d2c.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v10p300xu0snn7sjecukt.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v19mz00xv0snn7rmociqb.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v1mts00xw0snn4zufhxxr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1961,
                            "width": 2940,
                            "url": "https://cdn.impala.travel/properties/ckn8v5cog00xx0snnaupu9xij.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Viale Della Valletta, 180",
                        "line2": null,
                        "city": "Alessandria",
                        "postalCode": "15100",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 8.6977081,
                        "latitude": 44.8857307
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 120,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T12:44:53.693Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "8f1af73a-fe15-4fbb-8434-ac72966bae0c",
                            "name": " Family Room",
                            "description": "Family rooms are the ideal solution for families and small groups. Equipped with two large double beds, they can accommodate up to 5 people with the addition of a bed or cot. Unlike the previous rooms, these rooms feature a large bathroom with bath and shower, and are also much larger than the Deluxe rooms, allowing them to meet the needs of a family.\n\nThe Family rooms are bright and furnished in a modern style with warm earth tones and include, in addition to the two large double beds, a full-length mirror and a large wall mirror that overlooks a comfortable illuminated desk with power sockets.\n\nWith independent temperature control.\n\nThe rooms feature honey-coloured parquet flooring, internally lit wardrobes and a luggage rack near the entrance. The beds are made up with soft and hygienic duvets to guarantee optimum comfort.\n\nThe bathroom includes a 90 x 90 shower cubicle with a large fixed rainfall shower head, as well as a large bath. The sink is equipped with a mixer tap, an illuminated mirror and suitable power sockets. Inside the bathroom you will also find a complete beauty set, letting you truly pamper yourself.\n\nFamily rooms are equipped with 42″ SMART TVs with digital terrestrial and satellite channels.",
                            "maxOccupancy": 5,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 126,
                                    "formatted": "Air conditioning individually controlled in room"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8v6ylt00y00snn9cly218q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8v73sf00y10snn62pb5gpa.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8v6ura00xz0snn5pi0atda.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "e370ce5a-288a-48c0-a97a-02971448ac13",
                            "name": " Business Suite",
                            "description": "The Business Suites are designed to meet the needs of the most exacting customers, offering a bright and spacious environment. They represent the ideal solution for anyone seeking the perfect combination of work and relaxation in complete comfort. The suite is divided into two separate areas: the double bedroom and the living area with a comfortable sofa, which can also be used for small meetings thanks to the conference table and two bathrooms.\n\nThe Business Suites feature contemporary designer furniture, two full-length mirrors and large luggage racks in the bedroom, as well as comfortable armchairs, a sofa and a conference table in the living area.\n\nWith independent temperature control.\n\nThe suites feature honey-coloured parquet flooring and internally lit wardrobes. The beds are made up with a soft and hygienic duvet to guarantee optimum comfort. The living room sofa can be converted into a double bed as required.\n\nFor greater comfort, the Business Suites include two bathrooms, one of which is equipped with a large bath fitted with a large fixed rainfall shower head, a collapsible shower handset and an anti-drip glass wall. The sinks in both bathrooms are equipped with a mixer tap, an illuminated mirror and suitable power sockets. Inside the bathroom you will find a complete beauty set, letting you truly relax and pamper yourself.\n\nThe Business Suites are equipped with two 42″ SMART TVs, one in the living area and one in the bedroom, with digital terrestrial and satellite channels.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 13,
                                    "formatted": "Bathtub"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8v7laa00y20snn8yrg93e9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8v7xvq00y40snn5gkzh5gm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8v835200y50snnbqlxeuf6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8v7tq300y30snn0jih9s7i.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "57123f99-09a2-4acd-8942-b6ae1fa00f69",
                            "name": " Economy Room",
                            "description": "The Economy rooms represent the entry level rooms available at the Diamante hotel. This category includes rooms for disabled guests, located on the second floor near the quieter areas and designed for a maximum occupancy of two people.\n\nThe Economy rooms are bright and furnished in a modern style with warm earth tones and include, in addition to the adaptable layout that can offer a large double bed or two separate beds, a full-length mirror and a large wall mirror that overlooks a comfortable illuminated desk with power sockets.\n\nWith independent temperature control.\n\nThe rooms feature honey-coloured parquet flooring, internally lit wardrobes and a luggage rack near the entrance. The beds are made up with a soft and hygienic duvet to guarantee optimum comfort.\nThe bathrooms include a 90 x 90 shower cubicle with a large fixed rainfall shower head and a flexible shower handset for guaranteed comfort and practicality, even during valuable moments of self-care. The sink is equipped with a mixer tap, an illuminated mirror and suitable power sockets. The floor is made from dark ceramic.\n\nEconomy rooms are equipped with 42″ SMART TVs with digital terrestrial and satellite channels.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 78,
                                    "formatted": "Pay per view movies on TV"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 667,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8v9uap00y60snn0s3c9z6n.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 800,
                                    "width": 1500,
                                    "url": "https://cdn.impala.travel/properties/ckn8va3v900y80snn8rzt46ad.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "2bdd04fe-6e4a-49a4-9da3-f0117c555ebf",
                            "name": " Superior Room",
                            "description": "With the same dimensions and basic layout as the Comfort rooms, including the wide corner window, the Superior rooms are set apart by their additional facilities, ensuring that guests enjoy a stay inspired by practicality and quality.\n\nThe Superior rooms also offer the option of adding a third bed and a cot.\n\nThe Superior rooms are bright and furnished in a modern style with warm earth tones and include, in addition to the adaptable layout that can offer a large double bed or two separate beds, a wide corner window, a full-length mirror and a large wall mirror that overlooks a comfortable illuminated desk with power sockets.\n\nSuperior rooms are equipped with a kettle with a selection of coffee and tea.\n\nWith independent temperature control.\n\nThe rooms feature honey-coloured parquet flooring, internally lit wardrobes and a luggage rack near the entrance. The beds are made up with a soft and hygienic duvet to guarantee optimum comfort.\n\nThe bathrooms include a 90 x 90 shower cubicle with a large fixed rainfall shower head and a practical shower handset. The floor is made from dark ceramic. The sink is equipped with a mixer tap, an illuminated mirror and suitable power sockets.\n\nInside the bathroom, the courtesy toiletries include a complete beauty set accompanied by soft terry towels, for more indulgent self-care.\n\nThe 42″ SMART TV with digital terrestrial and satellite channels completes the room.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 126,
                                    "formatted": "Air conditioning individually controlled in room"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8va96800ya0snncpb2fcmq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8va4o600y90snnbmfj6nz3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8va0v800y70snn3iopfw5q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1981,
                                    "width": 2940,
                                    "url": "https://cdn.impala.travel/properties/ckn8vailr00yb0snn2cc5eh37.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "62d89dcb-e068-4bcc-885e-2794ea1e41a2",
                            "name": " Gran Sonno Room",
                            "description": "The Gransonno rooms are slightly larger than the Economy rooms and are set apart by their wide corner window that, in addition to ensuring greater comfort, provides exceptional brightness.\n\nThe Gransonno rooms are furnished in a modern style with warm earth tones and include, in addition to the adaptable layout that can offer a large double bed or two separate beds, a full-length mirror and a large wall mirror that overlooks a comfortable illuminated desk with power sockets.\n\nWith independent temperature control.\n\nThe rooms feature honey-coloured parquet flooring, internally lit wardrobes and a luggage rack near the entrance. The beds are made up with a soft and hygienic duvet to guarantee optimum comfort.\n\nThe bathrooms include a 90 x 90 shower cubicle with a large fixed rainfall shower head and a flexible shower handset, or a bath, to suit every customer’s needs. The sink is equipped with a mixer tap, an illuminated mirror and suitable power sockets. The floor is made from dark ceramic.\n\nGransonno rooms are equipped with 42″ SMART TVs with digital terrestrial and satellite channels.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8vb4od00yd0snn8t4z1f6s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8vba3e00ye0snn0oita1bk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1961,
                                    "width": 2970,
                                    "url": "https://cdn.impala.travel/properties/ckn8vaypt00yc0snn9m887r0m.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "84836aa8-282b-435c-8791-a088551fdf5b",
                    "name": "Antica Locanda dei Mercanti [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Antica Locanda dei Mercanti has a stunning location in the heart of Milan with guarded garage nearby. In ten minutes walk you can reach the fashion district."
                    },
                    "phoneNumbers": [
                        "+39 02 8054080"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+84836aa8-282b-435c-8791-a088551fdf5b@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1200,
                            "url": "https://cdn.impala.travel/properties/ckn8uhrri00x60snn0iel6jm9.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1125,
                            "url": "https://cdn.impala.travel/properties/ckn8uhd7e00x40snnfsrq8q4b.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8ui3gf00x70snn7jwb70mn.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 854,
                            "width": 1280,
                            "url": "https://cdn.impala.travel/properties/ckn8uice500x80snn0s8m20b9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2560,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8uipto00xa0snnf3pa9v1g.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2048,
                            "width": 1536,
                            "url": "https://cdn.impala.travel/properties/ckn8uiyx300xb0snn0u9n9iiw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1419,
                            "width": 1153,
                            "url": "https://cdn.impala.travel/properties/ckn8uj74h00xc0snn8xfddfr7.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1280,
                            "width": 1270,
                            "url": "https://cdn.impala.travel/properties/ckn8ujedf00xd0snn5sekf402.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1280,
                            "width": 960,
                            "url": "https://cdn.impala.travel/properties/ckn8ujkp100xe0snndufigzc8.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3051,
                            "width": 2446,
                            "url": "https://cdn.impala.travel/properties/ckn8ujr9u00xf0snnfl2sfhfv.webp",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8uk3uc00xg0snnc0ky1iru.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1280,
                            "width": 960,
                            "url": "https://cdn.impala.travel/properties/ckn8ukcin00xh0snnfndm6jwo.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Via San Tomaso 6",
                        "line2": null,
                        "city": "Milan",
                        "postalCode": "20121",
                        "region": null,
                        "country": "ITA",
                        "countryName": "Italy"
                    },
                    "location": {
                        "longitude": 9.1847129,
                        "latitude": 45.4672023
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 14,
                            "formatted": "Business library"
                        },
                        {
                            "code": 36,
                            "formatted": "Express check-in"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 197,
                            "formatted": "Locker room"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 37,
                            "formatted": "Express check-out"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 15,
                    "checkIn": {
                        "from": "14:00",
                        "to": "22:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T12:28:31.388Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "5ec3584a-7a16-464b-a9fe-e18943132f53",
                            "name": "Deluxe Room with Terrace",
                            "description": "Large and very bright room with private terrace. Top floor.\nSize : 18-22 sq.m + terrace up to 20 sq.m\nBed : 1 Queen size or 2 Twin beds\nBathroom : Ensuite marble with Shower and Courtesy bathroom set",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 846,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8uaw6600ws0snn6qwghw5i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 675,
                                    "url": "https://cdn.impala.travel/properties/ckn8u9xzf00wr0snn11ychtcq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8u9lbi00wq0snnde9ddj24.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8u97ue00wp0snnhvxodoox.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8to77n00vy0snna4dddc42.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1537,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8tfzes00vv0snnctio8cpj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8uggmt00x30snn2no514uo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1125,
                                    "url": "https://cdn.impala.travel/properties/ckn8ugax200x20snn7pstfx67.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ug4nv00x10snne1lx6zs9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 975,
                                    "url": "https://cdn.impala.travel/properties/ckn8ufy3g00x00snn0eft41lz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8ufrq200wz0snn2rr3hupu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 576,
                                    "url": "https://cdn.impala.travel/properties/ckn8ubpoe00wy0snn4lo1cc8a.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8ubjjc00wx0snnbz2tbb32.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8ubegg00ww0snn1mty5d69.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8ub9vg00wv0snnhsfc6xl7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8ub4cb00wu0snn0xz08xqw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 576,
                                    "url": "https://cdn.impala.travel/properties/ckn8uazjk00wt0snn1axa7hse.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "d0ababb0-4011-43e9-ac60-759dcf67a8d8",
                            "name": "Standard Room with Terrace",
                            "description": "Size : 16-18 sq.m + terrace up to 20 sq.m\nBed : 1 Queen size or 2 Twin beds\nStart your day on the terrace with a wholesome breakfast in the sunshine, or wind down with a relaxing aperitif before dinner. The rooms are tastefully furnished, light and airy with original floors in Venetian graniglia, LCD TV, air conditioning, free Wi-Fi Internet access, safe deposit box and minibar on request.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1536,
                                    "width": 2303,
                                    "url": "https://cdn.impala.travel/properties/ckn8tqcqk00w20snn4xa5eknv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8tqtpp00w30snnh9yb1vqg.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1537,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8tgh3200vw0snn9xhd2is2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2048,
                                    "width": 1536,
                                    "url": "https://cdn.impala.travel/properties/ckn8tgpqt00vx0snnfdrp2h52.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 675,
                                    "url": "https://cdn.impala.travel/properties/ckn8tovh300vz0snn6jl2743i.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1537,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8tpbqw00w00snn1lb8c08l.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1537,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8tpry600w10snn4iqlfvjw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8trxl500w50snn17p9f196.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8trevs00w40snn5ebp7azd.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "e243c6be-9099-4f92-803b-2c8ff19f84a9",
                            "name": "Superior Room",
                            "description": "16 sqm, double or twin bed, floor with wool carpeting or wood, cotton fabrics embroidered pastel light colors, marble bathroom with shower, towel warmer, hairdryer, library, fresh flowers, telephone, WI-FI internet access.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 1536,
                                    "width": 2303,
                                    "url": "https://cdn.impala.travel/properties/ckn8tu5qe00w60snne2xteoi1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8tz3xn00wa0snn5r1q7a4q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8tybye00w90snngzng5347.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8u0wh100wd0snnd4zo92nx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1537,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8turjh00w80snne0oo2bhn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2400,
                                    "width": 3600,
                                    "url": "https://cdn.impala.travel/properties/ckn8u09dw00wc0snn9bupbikf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8tzsym00wb0snn75bodv01.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1775,
                                    "width": 2305,
                                    "url": "https://cdn.impala.travel/properties/ckn8tufi700w70snn0yw5a49s.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "77d9c3b1-93f7-4f62-8bb5-2970c640a8e8",
                            "name": "Suite + 1 Extra Bed",
                            "description": "Very luminous thanks to the large windows and predominantly light colours of the furnishing and natural hardwood floor. The suites are charmingly furnished with a mixture of modern and antique furniture. 35/40 sq.m., double or twin beds; one or two bedrooms (communicating suites ).\nThe living room may be separate from the bedroom with a sliding Japanese-style paper/glass partition or may be an open-space with or without a mini-kitchen.\nThe atmosphere is one of refined tranquil elegance, and each Guest is welcomed with fresh flowers to help them feel at home. Air conditioning, minibar on request, LCD TV, free Wi-Fi Internet access.\nMarble bathrooms with walk-in shower, heated towel rail, hairdryer and magnifying mirror.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8u4u9a00wj0snn0calbzyp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8u8ms600wo0snn9rs92e7f.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1279,
                                    "url": "https://cdn.impala.travel/properties/ckn8u3mrn00wh0snn6zn4g0kt.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1536,
                                    "width": 2303,
                                    "url": "https://cdn.impala.travel/properties/ckn8u294w00wf0snngyfa4jbx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8u7o0700wn0snncx4hbxq2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1288,
                                    "width": 2000,
                                    "url": "https://cdn.impala.travel/properties/ckn8u2mvp00wg0snn2w15cphe.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8u6n8z00wm0snnhlv49sg9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1536,
                                    "width": 2303,
                                    "url": "https://cdn.impala.travel/properties/ckn8u1xwo00we0snn9iww4pqd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 854,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8u5wqw00wl0snn9o7ya9nf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 686,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8u59mq00wk0snn9z1m36zj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1279,
                                    "url": "https://cdn.impala.travel/properties/ckn8u3z5500wi0snn3qwp4hq6.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "9853849b-9775-4f88-ae52-38a0988ff0d0",
                    "name": "Nivia Born Boutique Hotel [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "The luxury of a superior four-star hotel in Mallorca but with an independent spirit, Nivia Born Boutique Hotel stands in the heart of Palma, on the centre’s majestic boulevard, the exclusive Passeig des Born. At Nivia Born you will find the rest you deserve in a unique atmosphere reminiscent of times past, but with every modern amenity."
                    },
                    "phoneNumbers": [
                        "+34 971 888 444"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+9853849b-9775-4f88-ae52-38a0988ff0d0@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 640,
                            "width": 640,
                            "url": "https://cdn.impala.travel/properties/ckn8t3m9z00v90snnc8hld58p.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 640,
                            "width": 640,
                            "url": "https://cdn.impala.travel/properties/ckn8t3qfm00va0snn7zn4fc4e.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckn8t3v7700vb0snnbdyk35el.png",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckn8t3xm700vc0snngezgblpj.png",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 900,
                            "width": 1800,
                            "url": "https://cdn.impala.travel/properties/ckn8t3zyq00vd0snnau8b9nn1.png",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn8t41zc00ve0snn170v98d5.png",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn8t455a00vf0snn0nfgg79z.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 800,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn8t46jo00vg0snn41oe91v6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 800,
                            "url": "https://cdn.impala.travel/properties/ckn8t49dw00vh0snn5beq6kp6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 1900,
                            "url": "https://cdn.impala.travel/properties/ckn8t4hfe00vi0snn7avkdv57.png",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 600,
                            "width": 1900,
                            "url": "https://cdn.impala.travel/properties/ckn8tgklu00013b6bf2ntzrl6.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Calle Paraires, 24",
                        "line2": null,
                        "city": "Palma De Mallorca",
                        "postalCode": "07001 ",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": 2.6471117,
                        "latitude": 39.5701018
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 26,
                            "formatted": "Currency exchange"
                        },
                        {
                            "code": 36,
                            "formatted": "Express check-in"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 53,
                            "formatted": "Indoor parking"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 77,
                            "formatted": "Room service"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 230,
                            "formatted": "Secured parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 342,
                            "formatted": "Snack bar"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 37,
                            "formatted": "Express check-out"
                        }
                    ],
                    "roomCount": 24,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T11:46:13.735Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "08a1fb05-b545-4119-a306-5ff29171e9db",
                            "name": "Sweet Room",
                            "description": "Our sweetest room. These deliciously comfortable rooms measuring 26m2 are distributed over several different floors and provide views of Pelaires street. They provide all the comforts and conveniences you need to ensure maximum wellbeing. Discover the sweet delight that awaits you inside.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 817,
                                    "url": "https://cdn.impala.travel/properties/ckn8t77g000vk0snnady063y5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 724,
                                    "width": 978,
                                    "url": "https://cdn.impala.travel/properties/ckn8t7awb00vm0snneufzh3vz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t757y00vj0snn9zff61mk.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t79et00vl0snngucd3xjg.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "5201ecc5-9746-461b-a18f-38f85c6430c0",
                            "name": "Princess Junior Suite",
                            "description": "The jewel in the crown at Nivia. These sublime rooms with an area of 35m2 offer splendid views of the majestic Paseo del Borne that you can contemplate from your glazed balcony. The beautifully designed space with en suite bathroom, open wardrobe and fantastic dressing table contribute to the distinguished and elegant feel of this room that will make you feel like a true Prince or Princess when staying at our hotel.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t84cz00vp0snn70yb7qko.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t866s00vq0snn5aog0z96.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t82e600vo0snnh4xa5yxr.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "dd41858a-7176-4371-b2fb-f5ed0b9a6523",
                            "name": "Cozy Room",
                            "description": "Feel at home with an extra touch of luxury. These bright, welcoming rooms measuring 22m2 provide the perfect space for relaxing in the hydromassage tub and enjoying the delight of a perfect stay. Rooms are distributed over several different floors and look out onto Pelaires street.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 69,
                                    "formatted": "Minibar"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 9,
                                    "formatted": "Bath tub with spray jets"
                                },
                                {
                                    "code": 10,
                                    "formatted": "Bathrobe"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 724,
                                    "width": 978,
                                    "url": "https://cdn.impala.travel/properties/ckn8t8zsc00vu0snn3cyw2zsp.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 817,
                                    "url": "https://cdn.impala.travel/properties/ckn8t8uke00vs0snnbrie80eq.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t8lys00vr0snne01x6zqf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 750,
                                    "width": 1000,
                                    "url": "https://cdn.impala.travel/properties/ckn8t8xxo00vt0snn5qpe19zh.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "3d8e2a5b-f8e7-4ff1-8416-7b46a402560b",
                    "name": "Yon Essaouira [SANDBOX]",
                    "currency": "MAD",
                    "starRating": 4,
                    "description": {
                        "short": "Welcome to a place where time slows down and the days are long with opportunity. Hidden away amongst the Argan trees on the outskirts of this beach town you’ll find Yon Essaouira; a place of barefoot luxury where white wash cottages have been lovingly restored into guest rooms dotted around the gardens and overlooking the ocean. Fireplaces are lit as you return from a day in the surf, and the cocktail bar begins to come to life as the sun sets."
                    },
                    "phoneNumbers": [
                        "+447758088294"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+3d8e2a5b-f8e7-4ff1-8416-7b46a402560b@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0db700uu0snncaci76eh.jpeg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0c2p00ut0snndujuc7q6.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0ehm00uv0snn13h880q4.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0fv300uw0snn11r4c7uw.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0h8n00ux0snn4l32gc6e.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0ims00uy0snn63433sb3.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0k9500uz0snn8tvwglma.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0lmn00v00snn7dzz8ved.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0mxx00v10snn3ep9di3r.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0oep00v20snn16clcmr5.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0pmu00v30snn3n0s9o2p.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0qrs00v40snne5le8bo1.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0rv000v50snnax1c7tat.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0t5i00v60snn2u5z19vv.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0ua500v70snnf6vj3q7j.jpeg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 490,
                            "width": 700,
                            "url": "https://cdn.impala.travel/properties/ckn8t0vkk00v80snngwc64z3r.jpeg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Domaine De Magador",
                        "line2": null,
                        "city": "Essaouira",
                        "postalCode": "44000",
                        "region": null,
                        "country": "MAR",
                        "countryName": "Morocco"
                    },
                    "location": {
                        "longitude": -9.764159,
                        "latitude": 31.467376
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 41,
                            "formatted": "Free airport shuttle"
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 84,
                            "formatted": "Spa"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 19,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T11:38:36.143Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "af7e2d17-07c8-4a6f-b9e1-062c23294f11",
                            "name": "Superior Double",
                            "description": "The superior double bedrooms are a spacious 323ft² with a private terrace, a queen size bed and sofa, fire place and ensuite bathroom.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sl9eo00tm0snn2t3v94dv.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8slavy00tn0snn9ry06546.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8slc3v00to0snn2lyp45gx.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sld8w00tp0snn3yr96gje.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "765109a4-8544-4ff5-805c-01c428274db3",
                            "name": "Standard Double",
                            "description": "A cosy room at 269ft² with a double bed, a fireplace, wardrobe, ensuite bathroom, workspace and a terrace with views of the ocean and the gardens. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smnq600tt0snnb493ccb6.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smmf300ts0snn9dk0d1t4.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smld200tr0snncf709dzx.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smk0400tq0snn6awad75n.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smpss00tv0snn8zw4anbp.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8smorz00tu0snn7nj8a4j1.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "61589332-682b-4dc5-8bed-823478d18598",
                            "name": "Standard Suite",
                            "description": "The standard suites offer large double bedrooms with a queen size bed, a fireplace, a private bathroom with shower and a private terrace with a view of the garden and the ocean. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ss63r00tw0snn2bqs58qo.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sshng00u50snn1whu6c79.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssinh00u60snn8igi2snf.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssjq800u70snn2fv22ncb.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssgjk00u40snncf3fh0rl.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssfi400u30snn5yl994ad.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sseef00u20snn36d5exo7.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssd6y00u10snnfc9edru1.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ssbmv00u00snnaedyfmc2.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ss9sl00tz0snn08705kox.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ss8ir00ty0snn4iio4z4o.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8ss7fn00tx0snn293z47ky.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "4f30697b-8d84-4af5-9886-54018169960e",
                            "name": "Pavilion Suite",
                            "description": "The Pavillion Suites are spacious double rooms with a queen size bed and an additional living area set across 592ft², a fireplace, a private bathroom with shower and a large private terrace with view of the garden and the ocean. ",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8stuuc00u80snnf0k24sf6.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8stw2400u90snnh59b183g.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8stx4200ua0snne8huge22.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sty5a00ub0snn8qjhhj3b.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8stz5r00uc0snngd9564my.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8su0ji00ud0snn9iwybwg8.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8su1ul00ue0snn5nnxaybp.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8su3fv00uf0snn7p7m5111.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8su4n200ug0snna9bqhm3z.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8su5lv00uh0snn2cwo5xic.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "a9c56cad-79d3-4c3f-8bfb-1f425e3922ff",
                            "name": "Grand Pavilion Suite",
                            "description": "The Grand Pavilion Suite is a very large independent pavilion at 807ft² composed of 2 separate sleeping spaces, one with 2 single beds and the other with a queen size double bed and an en-suite bathroom with shower. An extra bed can be added if needed for a 5th person. You also have a separate living area with a fireplace, a private terrace and garden with ocean view. ",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sv7gl00uk0snn38df1hlv.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sv9pj00um0snngo9jfd9f.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sv8ma00ul0snn2dx4gb9v.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sv68700uj0snnb43bh889.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sv4wz00ui0snnaaaub7vd.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "2c124f06-9dd5-4ca1-804e-980d8b704259",
                            "name": "Grand Duplex Suite",
                            "description": "The Grand Duplex suite is a very large suite set across two floors totaling 861ft². Downstairs is a living room and bathroom, with the option of two additional 2 single beds, and upstairs is a bedroom with king size bed and a large, private terrace for intimate sunbathing. Both levels are equipped with fireplaces. Suitable for groups of friends. ",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8swm3g00up0snn9mo557v7.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8swkw000uo0snn28007x3b.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8swj9100un0snnduruauda.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8sx1ey00us0snn4fx2cxoo.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8swod200ur0snnggee46xt.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 490,
                                    "width": 700,
                                    "url": "https://cdn.impala.travel/properties/ckn8swnbl00uq0snn83gdb0l6.jpeg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "2196c8c9-bc59-4f0f-81bf-3b1e59dfe215",
                    "name": "Harbour House Hotel [SANDBOX]",
                    "currency": "GBP",
                    "starRating": 3,
                    "description": {
                        "short": "The Harbour House Hotel, and Anglesea Apartments is located in the picturesque seaside village of Portpatrick, Dumfries and Galloway. Settled in south west Scotland with views over the Irish Sea, the hotel has a seafront terraced restauran  as well as a cosy lounge and bar area."
                    },
                    "phoneNumbers": [
                        "01776 810456"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+2196c8c9-bc59-4f0f-81bf-3b1e59dfe215@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 777,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn8rkt4100rg0snn5uoe6ev4.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rjp0g00r30snnainlafdm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rjvxm00r60snngobuhve5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rk57j00rb0snn4xev5k03.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3201,
                            "width": 2401,
                            "url": "https://cdn.impala.travel/properties/ckn8rkcvc00rd0snnauo3bo3q.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1200,
                            "width": 1600,
                            "url": "https://cdn.impala.travel/properties/ckn8rkkoy00rf0snn7vps4cey.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 649,
                            "width": 1338,
                            "url": "https://cdn.impala.travel/properties/ckn8rkyfd00rh0snn28g5b6my.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1512,
                            "width": 2016,
                            "url": "https://cdn.impala.travel/properties/ckn8rl3vi00rj0snnam7r4ty9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rlced00rl0snngfibbmud.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rlk4500ro0snn2wv0epjo.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rlsm000rq0snnhczkcxmr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rlz2700rs0snn2r2d8mx7.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rm8ab00rt0snn6zki09sk.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8rmi3500ru0snn8fg26ed9.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8rmsvw00rw0snncqcgf18h.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8rn1zp00rz0snnbwtn18kx.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rnbgp00s10snn46l5h3yr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2880,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8rnmz200s60snn0c2a5n14.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8rp50000sb0snnemakgd6s.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "53 Main Street",
                        "line2": null,
                        "city": "Portpatrick ",
                        "postalCode": "DG9 8JW",
                        "region": null,
                        "country": "GBR",
                        "countryName": "United Kingdom of Great Britain and Northern Ireland"
                    },
                    "location": {
                        "longitude": -5.1168793,
                        "latitude": 54.8419463
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 14,
                            "formatted": "Business library"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 239,
                            "formatted": "Beachfront"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 12,
                    "checkIn": {
                        "from": "15:00"
                    },
                    "checkOut": {
                        "to": "10:30"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T11:22:17.922Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "a638ac9c-44a7-4c26-a834-115232b9924e",
                            "name": "Apartment - Standard",
                            "description": "Bedding: 1 x Double sofa bed, 1 x Double bed. ",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8ruet800sk0snn2t7bedb0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rtvik00si0snn3thvb8lr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1856,
                                    "width": 3824,
                                    "url": "https://cdn.impala.travel/properties/ckn8ru63f00sj0snne8vv3rng.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "9a1371bd-8b74-4d9c-bd79-ab71e3030414",
                            "name": "Family Room - Superior",
                            "description": "Bedding: 2 x Single bed, 1 x Double bed.\nGuests: 4 people.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rw7ar00sm0snn5qul4h0t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 826,
                                    "width": 400,
                                    "url": "https://cdn.impala.travel/properties/ckn8sf5zb00te0snn9d6qd7g7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rw0on00sl0snn3vqm3ref.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "112033c6-411b-4f53-9e14-f7ba5700b869",
                            "name": "Twin Room - Standard",
                            "description": "Bedding: 2 x Single bed.\nGuests: 2 people.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 400,
                                    "width": 824,
                                    "url": "https://cdn.impala.travel/properties/ckn8sftcz00tg0snnhvgx6xc3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rx7vs00sr0snn2010di0l.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 629,
                                    "width": 1296,
                                    "url": "https://cdn.impala.travel/properties/ckn8rwze900so0snn5zj8902q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 826,
                                    "width": 400,
                                    "url": "https://cdn.impala.travel/properties/ckn8sfqjv00tf0snn9v8x0cdz.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "ef76546c-330e-4895-a121-a847fa47b887",
                            "name": "Apartment - Superior",
                            "description": "Bedding: 2 x Single bed, 1 x Double sofa bed, 1 x Double bed.\nGuests: 6 people.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8ryvfb00t00snn6u6w7lpr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rzetf00t20snn1ivwbui1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1856,
                                    "width": 3824,
                                    "url": "https://cdn.impala.travel/properties/ckn8rzpy600t30snnhzm50y6l.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8ryp6v00sz0snnefdia1wx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rygql00sy0snnb6nx7ekx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 629,
                                    "width": 1296,
                                    "url": "https://cdn.impala.travel/properties/ckn8rz63800t10snn0qxd77r6.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "150ff15c-0805-4d30-8833-af630ece67e4",
                            "name": "Double Room - Standard",
                            "description": "Bedding: 1 x Double bed.\nGuests: 2 people.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 826,
                                    "width": 400,
                                    "url": "https://cdn.impala.travel/properties/ckn8sgwzt00tj0snn6ua41eib.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s0ktg00t70snn9n4o5whm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s0zop00t90snn5ad9fsp4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s0iz600t60snnb9gle5yd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s0rzp00t80snnhuyo47yn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s0h3f00t50snnb5uq1cp2.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "9a19bce9-252b-456a-a046-31015999f6c3",
                            "name": "Double Room with Sea View",
                            "description": "Bedding: 1 x King-size bed.\nGuests:\t2 people.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 97,
                                    "formatted": "Shower only"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 55,
                                    "formatted": "Iron (ironing facilities)"
                                },
                                {
                                    "code": 228,
                                    "formatted": "Slippers"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s1ep100ta0snnekih3u2w.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 777,
                                    "width": 1600,
                                    "url": "https://cdn.impala.travel/properties/ckn8s1ki900tb0snnhg6a3ve3.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "8600bc8b-5c0f-4aae-9bcd-b44cde7bfbce",
                    "name": "Waterfront Portpatrick  [SANDBOX]",
                    "currency": "GBP",
                    "starRating": 3,
                    "description": {
                        "short": "The Waterfront Hotel is a small quaint hotel with a nautical theme right on the harbour in the beautiful village of Portpatrick, with a large terrace and quaint cozy small lounge, and a bright Bistro restaurant. "
                    },
                    "phoneNumbers": [
                        "+44 0 1776 810800"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+8600bc8b-5c0f-4aae-9bcd-b44cde7bfbce@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rx2eq00sp0snne3co5f0g.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2362,
                            "width": 3543,
                            "url": "https://cdn.impala.travel/properties/ckn8rmox600rv0snn7gq90j5w.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2697,
                            "width": 3024,
                            "url": "https://cdn.impala.travel/properties/ckn8rt30j00sd0snn0e10d43t.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rt8bv00se0snn4v1w5pu1.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1536,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rtcrj00sf0snnej0remhw.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 682,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rthta00sg0snnebx6bqop.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rtm0r00sh0snndp9wa6u6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rwxjg00sn0snnfigr25vy.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rx6uj00sq0snn4qhkgucr.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1535,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rxbuc00ss0snnc4a527o5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rxggo00st0snnb9cbd4x0.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 683,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rxl6g00su0snn8up2exyc.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 768,
                            "width": 1024,
                            "url": "https://cdn.impala.travel/properties/ckn8rxqkz00sv0snnfn123a70.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 988,
                            "width": 1920,
                            "url": "https://cdn.impala.travel/properties/ckn8rxw9y00sw0snnghet80kc.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 547,
                            "width": 1368,
                            "url": "https://cdn.impala.travel/properties/ckn8ry10o00sx0snn6uisf8e5.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "7 North Crescent Portpatrick ",
                        "line2": null,
                        "city": "Portpatrick",
                        "postalCode": "DG9 8SX",
                        "region": null,
                        "country": "GBR",
                        "countryName": "United Kingdom of Great Britain and Northern Ireland"
                    },
                    "location": {
                        "longitude": -5.1177255,
                        "latitude": 54.8422745
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 14,
                            "formatted": "Business library"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 96,
                            "formatted": "Dry cleaning"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 168,
                            "formatted": "Onsite laundry"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 239,
                            "formatted": "Beachfront"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 269,
                            "formatted": "Meeting rooms"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 15,
                    "checkIn": {
                        "from": "15:00",
                        "to": "20:00"
                    },
                    "checkOut": {
                        "to": "10:30"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T11:13:52.059Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "007b0085-9ac5-4399-856d-bc92bf4f338c",
                            "name": "Family Room",
                            "description": "Family rooms are in the annex, with access to the street and gardens. They have a large double bed, flat-screen TV, tea/coffee maker and electric kettle. Private bathroom.",
                            "maxOccupancy": 3,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8rzrvk00t40snn5p8rbul4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8r4zmd00qk0snngfgb1d0h.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 855,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8r4hw800qi0snngzqs0u0s.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8r4qw400qj0snn22kz35p0.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "2bd516c2-a45b-4664-8e96-b5f40a91c503",
                            "name": "Sea View Double Room",
                            "description": "Sea view double rooms have one extra-large double bed, flat-screen TV, kettle and tea/coffee maker. Small Private bathroom.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2362,
                                    "width": 3543,
                                    "url": "https://cdn.impala.travel/properties/ckn8r78ck00qn0snn0xtncnmm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8r6rhx00ql0snn91jscov9.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2362,
                                    "width": 3543,
                                    "url": "https://cdn.impala.travel/properties/ckn8r6zuo00qm0snnayetbj3o.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3543,
                                    "width": 2390,
                                    "url": "https://cdn.impala.travel/properties/ckn8r7hib00qo0snn1b9z00wb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8r8c1n00qp0snn7fwb1mzi.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8r94na00qq0snnfm2yflfv.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "631c0f45-bc08-4118-93fa-2200f14032a2",
                            "name": "Double Room",
                            "description": "Double rooms at Waterfront Hotel feature a double bed, flat-screen TV, tea/coffee maker and electric kettle. Small Private bathroom.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8rc9p500qv0snn4hkpcofm.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2880,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8rbuy300qu0snn96vrbbmt.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2362,
                                    "width": 3543,
                                    "url": "https://cdn.impala.travel/properties/ckn8rbaao00qt0snndhfed1qe.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 768,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8raemn00qs0snna3o87150.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2367,
                                    "width": 3543,
                                    "url": "https://cdn.impala.travel/properties/ckn8ra71s00qr0snn1ppvaurs.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "d271436d-cbe5-454e-9f37-dd992acae095",
                            "name": "Twin Room",
                            "description": "The twin room features two single beds, flat-screen TV, electric kettle and tea/coffee maker. Small Private bathroom.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 3,
                                    "formatted": "Alarm clock"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8redko00qy0snn9cngdfbu.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2356,
                                    "width": 3543,
                                    "url": "https://cdn.impala.travel/properties/ckn8rdd5000qw0snndkln67ds.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 853,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8rdy4z00qx0snnaak5hubr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 3840,
                                    "width": 2880,
                                    "url": "https://cdn.impala.travel/properties/ckn8rf4zy00qz0snn4gd45w9e.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "25bd10d7-b6af-4d6d-829b-b6bb65ca200b",
                    "name": "Craigadam [SANDBOX]",
                    "currency": "GBP",
                    "starRating": 4,
                    "description": {
                        "short": "Craigadam is as convenient and central as it is a tranquil and relaxing place to stay for touring in South West Scotland. Just a few minutes from the main Carlisle to Stranraer road (A75) we offer traditional Scottish farmhouse hospitality, extended and made superbly comfortable into a quiet country haven and warm welcome for bed and breakfast guests."
                    },
                    "phoneNumbers": [
                        "01556 650 233"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+25bd10d7-b6af-4d6d-829b-b6bb65ca200b@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 882,
                            "width": 1241,
                            "url": "https://cdn.impala.travel/properties/ckn8rk6b200rc0snnhoi1awxu.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 882,
                            "width": 1241,
                            "url": "https://cdn.impala.travel/properties/ckn8rjsxa00r40snnc9tyaxox.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1225,
                            "width": 870,
                            "url": "https://cdn.impala.travel/properties/ckn8rjvgw00r50snnak4tg6cx.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 798,
                            "width": 1241,
                            "url": "https://cdn.impala.travel/properties/ckn8rjxqf00r70snned0v16db.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 882,
                            "width": 1241,
                            "url": "https://cdn.impala.travel/properties/ckn8rk0g400r90snn51qg23na.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 882,
                            "width": 1241,
                            "url": "https://cdn.impala.travel/properties/ckn8rk35500ra0snn64zd22q4.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Craigadam Country House Hotel",
                        "line2": null,
                        "city": "Castle Douglas",
                        "postalCode": "DG7 3HU",
                        "region": null,
                        "country": "GBR",
                        "countryName": "United Kingdom of Great Britain and Northern Ireland"
                    },
                    "location": {
                        "longitude": -3.8780845,
                        "latitude": 55.0354839
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 76,
                            "formatted": "Restaurant"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 165,
                            "formatted": "Lounges/bars"
                        },
                        {
                            "code": 186,
                            "formatted": "Street side parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 10,
                    "checkIn": {
                        "from": "17:00"
                    },
                    "checkOut": {
                        "to": "09:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T10:59:25.866Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "3cf13b44-3b07-47bb-988e-5e056ea0c854",
                            "name": "Self-Catering Cottage",
                            "description": "Craigadam self-catering cottage has three twin bedrooms, all en-suite, individually decorated to a theme – African, Florentine, and Scottish. The cottage has a comfortable sitting/dining room with French windows and a lovely view of the orchard.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 13,
                                    "formatted": "Bathtub"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 829,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rjxvp00r80snnalmo3zz6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rkjja00re0snn9hbf6f76.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 900,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rliz500rn0snn1u5o2j3x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1693,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rlsa700rp0snnd0stad69.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 833,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rlyae00rr0snn4pao8x3y.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 915,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rj0xd00r20snn4xy60aec.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 870,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rfbe300r00snn2drw4h0k.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 825,
                                    "width": 1200,
                                    "url": "https://cdn.impala.travel/properties/ckn8rfm6000r10snnexw5h8ag.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "7e4cd1a2-7da3-4b4c-9467-ea0167cbb6ca",
                            "name": "Twin Room",
                            "description": "These individually themed rooms are luxuriously furnished and include an en suite bathroom. There is a flat-screen TV, tea and coffee facilities and free Wi-Fi.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 5,
                                    "formatted": "AM/FM radio"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 891,
                                    "width": 1254,
                                    "url": "https://cdn.impala.travel/properties/ckn8rliue00rm0snnh0314imy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1237,
                                    "width": 865,
                                    "url": "https://cdn.impala.travel/properties/ckn8rl8i200rk0snn7ce23vn3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 891,
                                    "width": 1254,
                                    "url": "https://cdn.impala.travel/properties/ckn8rl0b100ri0snnfwbwfkni.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rnir200s40snn0xpf40iv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rngs100s30snn45c99h2o.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rncno00s20snn13ew46jy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rmuri00rx0snnbai61jxd.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rnkpm00s50snn9tkiborc.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "28a6c66b-8a56-444e-9b68-02d2ba780d8a",
                            "name": "Double",
                            "description": "With free Wi-Fi, this individually designed room offers a seating area, tea and coffee making facilities, and a flat-screen TV. Some feature a four-poster bed. Room facilities: Patio, Garden view, Flat-screen TV, Heating, Interconnected room(s) available",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 13,
                                    "formatted": "Bathtub"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 144,
                                    "formatted": "Soundproofed room"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 908,
                                    "width": 1212,
                                    "url": "https://cdn.impala.travel/properties/ckn8rmzi300ry0snnhwmygrza.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rnx9q00s70snneony3mqs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8ro1xd00s80snn8zyj9v4f.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 450,
                                    "width": 600,
                                    "url": "https://cdn.impala.travel/properties/ckn8rocbj00s90snndjf1ac7m.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1039,
                                    "width": 1900,
                                    "url": "https://cdn.impala.travel/properties/ckn8rodta00sa0snnhd4u5aw3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1212,
                                    "width": 835,
                                    "url": "https://cdn.impala.travel/properties/ckn8rn5le00s00snnbr0c2nqt.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "8bd85eee-a610-4cc3-a164-ed0e048b8b29",
                    "name": "Hotel Soho Boutique Urban [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 3,
                    "description": {
                        "short": "Discover the magic of Malaga at the Hotel Soho Boutique Urban, a new hotel in the centre of Malaga that will let you experience some very special days in a city full of charm, culture and great food. The design of the Soho Boutique Urban will ensure that due to its tranquil environment and modern yet elegant theme you will enjoy a unique break, both on holiday or for business trips, a stay full of comfort a few metres from the main places of interest for tourists in the city. We offer you very comfortable rooms, free Wi-Fi, 24h reception, a breakfast buffet, car rental service and airport transfers. Come and experience the Soho Boutique Urban de Málaga experience and immerse yourself in a city that radiates happiness from every part of it."
                    },
                    "phoneNumbers": [
                        "+34 900 701 193"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+8bd85eee-a610-4cc3-a164-ed0e048b8b29@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1717,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/ckn8qg6ae00qb0snnd5m2874z.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2257,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/ckn8qfyjd00q60snnbg0qbeov.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2090,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/ckn8qg0xl00q80snneeb3e1ep.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1717,
                            "width": 3801,
                            "url": "https://cdn.impala.travel/properties/ckn8qg3p100q90snng3778j8l.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Calle Vendeja, 7",
                        "line2": null,
                        "city": "Málaga",
                        "postalCode": "29001",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": -4.422636,
                        "latitude": 36.716536
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 50,
                            "formatted": "Housekeeping "
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 103,
                            "formatted": "Multilingual staff"
                        }
                    ],
                    "roomCount": 44,
                    "checkIn": {
                        "from": "14:00",
                        "to": "00:00"
                    },
                    "checkOut": {
                        "to": "12:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T10:27:01.240Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "85c603e2-d757-4184-b7de-2e73b2c201df",
                            "name": "Double Room",
                            "description": "The double rooms of the Hotel Soho Boutique Urban are very comfortable 18 m2 rooms that guarantee a very relaxing stay during your holidays and business trips. They are equipped with a double bed, or two single beds, television, safe, minibar, coffee maker, free Wi-Fi and a private bathroom with toiletries.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 28,
                                    "formatted": "Desk"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 3208,
                                    "width": 2859,
                                    "url": "https://cdn.impala.travel/properties/ckn8qhvkc00qh0snnghohfemj.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1884,
                                    "width": 2859,
                                    "url": "https://cdn.impala.travel/properties/ckn8qhmcv00qg0snnea3k317t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1694,
                                    "width": 3801,
                                    "url": "https://cdn.impala.travel/properties/ckn8qh58z00qe0snn319waahg.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 1892,
                                    "width": 2859,
                                    "url": "https://cdn.impala.travel/properties/ckn8qhdq500qf0snnb5nifa2w.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "6dbd44ec-e578-4a7c-a99e-9b941bb19655",
                    "name": "Apartamentos Guitart [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 3,
                    "description": {
                        "short": "Designed for family holidays, the Guitart Apartments offer excellent and accessible accommodation for families in Lloret de Mar, located in a magical setting, perfect for the enjoyment of young and old alike.\n\nJust 10 minutes away from the flats, you will find the wonderful beaches of the Costa Brava and you can also visit some small hidden coves. Escape from routine and create beautiful memories with your partner or your family."
                    },
                    "phoneNumbers": [
                        "+34 972 34 70 04"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+6dbd44ec-e578-4a7c-a99e-9b941bb19655@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 1213,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfuyc00q50snnb4i81kgf.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2562,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8q92uw00pl0snncm7106z5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2562,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8q975c00pm0snn49l2b59x.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2552,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8q9ek500pn0snn2rlhcjjm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2665,
                            "width": 3352,
                            "url": "https://cdn.impala.travel/properties/ckn8q9jja00po0snnap7b43yx.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1295,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qf16g00py0snng2xka8wu.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1224,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qf6qc00pz0snnczhf4end.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfc8a00q00snney9reyom.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qffxx00q10snn9cd4ecro.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfjwh00q20snnhzqga4xm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfpq400q30snnbx4adns5.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1085,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfstc00q40snnc1e02m1g.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qfzuh00q70snn6zu75b9d.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 1367,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qg5ie00qa0snn3d95gmqm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 3062,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qgnt000qc0snn419v20s6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2936,
                            "width": 2048,
                            "url": "https://cdn.impala.travel/properties/ckn8qgshr00qd0snnd7w83ipa.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "Josep Maria Sert, 16-18",
                        "line2": null,
                        "city": "Lloret De Mar",
                        "postalCode": "17310",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": 2.8376279,
                        "latitude": 41.6982024
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 35,
                            "formatted": "Fitness facilities"
                        },
                        {
                            "code": 54,
                            "formatted": "Indoor pool"
                        },
                        {
                            "code": 79,
                            "formatted": "Sauna"
                        },
                        {
                            "code": 168,
                            "formatted": "Onsite laundry"
                        },
                        {
                            "code": 327,
                            "formatted": "Events ticket service"
                        },
                        {
                            "code": 1,
                            "formatted": "24-hour front desk"
                        },
                        {
                            "code": 58,
                            "formatted": "Laundry/Valet service"
                        },
                        {
                            "code": 103,
                            "formatted": "Multilingual staff"
                        },
                        {
                            "code": 345,
                            "formatted": "Fitness Center"
                        }
                    ],
                    "roomCount": 47,
                    "checkIn": {
                        "from": "14:00"
                    },
                    "checkOut": {
                        "to": "10:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T10:24:56.683Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "680ae88c-784a-41ea-9dfd-c3843f122e68",
                            "name": "Apartment | 2-4 Adults",
                            "description": "The Guitart Apartments *** allow you to enjoy a superior space with 32 m². They have 1 bedroom, kitchen and separate bathroom and are fully equipped, with TV, sofa bed, fridge, microwave and terrace or balcony.\nWith capacity for up to 4 adults.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 102,
                                    "formatted": "Sofa Bed"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 13,
                                    "formatted": "Bathtub"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2548,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8q9rzc00pp0snn43vb2c3x.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2562,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8qa46q00pq0snn4jyp8nio.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 997,
                                    "width": 1766,
                                    "url": "https://cdn.impala.travel/properties/ckn8qd3qz00pw0snnajiqg513.jpeg"
                                },
                                {
                                    "altText": null,
                                    "height": 997,
                                    "width": 1766,
                                    "url": "https://cdn.impala.travel/properties/ckn8qd5pb00px0snndr0o6y1v.jpeg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "50479d4e-81f0-41c3-9c32-136bbd077e58",
                            "name": "Sea View Suite",
                            "description": "The Sea View Suite allows you to enjoy a superior space with 30 m². They have 1 bedroom and separate bathroom and are fully equipped, with TV, sofa, fridge and balcony.",
                            "maxOccupancy": 2,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 142,
                                    "formatted": "Shower"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 625,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8qbe9200pu0snn4tw6ctn4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 683,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8qb5un00pt0snn0ze4ea2h.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 658,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8qazu700ps0snn2x4xd5r4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 629,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8qasuz00pr0snn0nhy9zmq.jpg"
                                }
                            ]
                        }
                    ]
                },
                {
                    "hotelId": "10decd9a-5a7e-463e-b18a-2d5739a873b4",
                    "name": "Arago312 Barcelona Apartments [SANDBOX]",
                    "currency": "EUR",
                    "starRating": 4,
                    "description": {
                        "short": "Arago312 Apartments provide the best accommodation in the city center of Barcelona."
                    },
                    "phoneNumbers": [
                        "+34638968721"
                    ],
                    "contractable": true,
                    "emails": [
                        "gdapi-staging-hotel+10decd9a-5a7e-463e-b18a-2d5739a873b4@getimpala.com"
                    ],
                    "websiteUrl": null,
                    "images": [
                        {
                            "altText": null,
                            "height": 2555,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8puw1e00pc0snn2hxyaorh.jpg",
                            "isHeroImage": true
                        },
                        {
                            "altText": null,
                            "height": 2497,
                            "width": 3752,
                            "url": "https://cdn.impala.travel/properties/ckn8pr34h00p60snne5c6dsw6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2501,
                            "width": 3759,
                            "url": "https://cdn.impala.travel/properties/ckn8prgvi00p70snnfggc3xzt.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2177,
                            "width": 3345,
                            "url": "https://cdn.impala.travel/properties/ckn8prubl00p80snnd5e76g0f.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2554,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8psd1z00p90snn8fav3gn6.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2403,
                            "width": 3611,
                            "url": "https://cdn.impala.travel/properties/ckn8pu6te00pa0snn5yxncrno.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2202,
                            "width": 3309,
                            "url": "https://cdn.impala.travel/properties/ckn8puk0400pb0snn1lwf4mgo.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2118,
                            "width": 3183,
                            "url": "https://cdn.impala.travel/properties/ckn8pv75q00pd0snnag195h2i.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2533,
                            "width": 3806,
                            "url": "https://cdn.impala.travel/properties/ckn8pvjc600pe0snn9gjo34hl.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2169,
                            "width": 3260,
                            "url": "https://cdn.impala.travel/properties/ckn8pvvnk00pf0snng3sogh7m.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2514,
                            "width": 3777,
                            "url": "https://cdn.impala.travel/properties/ckn8pw7gn00pg0snnfkxc2pvp.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2526,
                            "width": 3797,
                            "url": "https://cdn.impala.travel/properties/ckn8pwk1n00ph0snng8ze1e99.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2507,
                            "width": 3768,
                            "url": "https://cdn.impala.travel/properties/ckn8pwwld00pi0snnf90ug3qn.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2554,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8px7tc00pj0snngjgkc5jm.jpg",
                            "isHeroImage": false
                        },
                        {
                            "altText": null,
                            "height": 2555,
                            "width": 3840,
                            "url": "https://cdn.impala.travel/properties/ckn8pxit200pk0snn5gqr4gj3.jpg",
                            "isHeroImage": false
                        }
                    ],
                    "address": {
                        "line1": "C/ D'aragó 312 ",
                        "line2": null,
                        "city": "Barcelona",
                        "postalCode": "08009 ",
                        "region": null,
                        "country": "ESP",
                        "countryName": "Spain"
                    },
                    "location": {
                        "longitude": 2.1686197,
                        "latitude": 41.3947078
                    },
                    "timezone": "Europe/London",
                    "amenities": [
                        {
                            "code": 5,
                            "formatted": "Air conditioning"
                        },
                        {
                            "code": 91,
                            "formatted": "Tour/sightseeing desk"
                        },
                        {
                            "code": 116,
                            "formatted": "Accessible parking"
                        },
                        {
                            "code": 122,
                            "formatted": "Shops and commercial services"
                        },
                        {
                            "code": 230,
                            "formatted": "Secured parking"
                        },
                        {
                            "code": 242,
                            "formatted": "Heated guest rooms"
                        },
                        {
                            "code": 262,
                            "formatted": "Kitchenette"
                        },
                        {
                            "code": 198,
                            "formatted": "Non-smoking rooms (generic)"
                        }
                    ],
                    "roomCount": 24,
                    "checkIn": {
                        "from": "15:00",
                        "to": "21:00"
                    },
                    "checkOut": {
                        "to": "11:00"
                    },
                    "termsAndConditions": "",
                    "createdAt": "2021-04-08T10:19:50.139Z",
                    "updatedAt": "2022-03-28T09:31:07.620Z",
                    "externalUrls": [],
                    "roomTypes": [
                        {
                            "roomTypeId": "7bfa0319-914b-4046-8236-283488b7d9f5",
                            "name": "Standard Apartament ",
                            "description": "Spacious apartments totally remodeled with capacity for 6 people in 3 double bedrooms. The apartments also have 2 full bathrooms with shower and/or bathtub, a dining – lounge area and a fully equipped kitchen with fridge, oven, microwave, coffee and tea makers and dishwasher. Other services provided are satellite TV, washing machine, iron, linens and towels.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8nc3m100iu0snn2ry6evo3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2540,
                                    "width": 3818,
                                    "url": "https://cdn.impala.travel/properties/ckn8na6dq00io0snna8pt8v75.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2492,
                                    "width": 3745,
                                    "url": "https://cdn.impala.travel/properties/ckn8nbcr900it0snn8ukg6w66.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ncvzn00iz0snnaat7c2t3.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ndwa000j10snn5c1y1x7q.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8nf0l800j40snn13fm23jx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ngv5v00jc0snn3pyk3jbx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ni51z00jm0snn4w3i9cp2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8njm7800jo0snn0tct0mqe.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8nl45500jt0snng21g68hf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8nmy9900jz0snn37of038d.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8np7aa00k30snn767cepcx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8nshas00k60snng39oe2zv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2538,
                                    "width": 3814,
                                    "url": "https://cdn.impala.travel/properties/ckn8nv1wm00ke0snncz3e9ifz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8naqqi00iq0snnbagifdce.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "8af818bb-b697-4a06-89e9-d83fb7ec8f4b",
                            "name": "Penthouse 2 Bedrooms",
                            "description": "Penthouse apartment with two double bedrooms. The apartment also has 2 full bathrooms with bath/shower, living-dining room and a full equipped kitchen with fridge, oven, microwave, coffee and tea maker and washing machine.\nThe apartment has a large terrace with amazing city views and overlooking to Sagrada Familia.",
                            "maxOccupancy": 4,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 11,
                                    "formatted": "Bathroom amenities (free toiletries)"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8o3nwi00lc0snnh84g2rv6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8o9lxm00ll0snn1xvx30ra.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2372,
                                    "width": 3565,
                                    "url": "https://cdn.impala.travel/properties/ckn8o7wk100lk0snn4tbz28su.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8o5tjp00le0snn53094pk2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2553,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8o4rde00ld0snn1icng3d1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8odnjr00lo0snn81l89ds2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2177,
                                    "width": 3345,
                                    "url": "https://cdn.impala.travel/properties/ckn8oweop00mh0snndk7g1grg.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2501,
                                    "width": 3759,
                                    "url": "https://cdn.impala.travel/properties/ckn8ox4qy00mi0snn38xlg7z7.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2202,
                                    "width": 3309,
                                    "url": "https://cdn.impala.travel/properties/ckn8oyqbb00mk0snnfmhlhobv.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8oz1hu00ml0snne6gk0klt.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2526,
                                    "width": 3797,
                                    "url": "https://cdn.impala.travel/properties/ckn8ozcwh00mm0snn5bmtgv20.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ozpnf00mn0snn1f1h6qsw.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ozyz600mp0snn9h6974t0.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p08p400mt0snn498obsr5.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "a19859a3-6a0f-4484-9a01-2bf7d326927e",
                            "name": "Superior Apartament",
                            "description": "Bright and spacious apartment located in Paseo de Gracia, on the main city center of Barcelona and near Plaza Cataluña and Las Ramblas. The apartment has capacity for 6 people in 3 double bedrooms, 2 full bathrooms with bathtub and/or shower, a dining and lounge area and a fully equipped kitchen with fridge, oven, microwave, coffee and tea maker and dishwasher. Other services provided are satellite TV, washing machine, dryer, iron, linens and towels.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 626,
                                    "width": 941,
                                    "url": "https://cdn.impala.travel/properties/ckn8o7ibn00lj0snn7vhigd3e.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 628,
                                    "width": 944,
                                    "url": "https://cdn.impala.travel/properties/ckn8o745z00lh0snnf86b5w12.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 646,
                                    "width": 970,
                                    "url": "https://cdn.impala.travel/properties/ckn8o6znr00lg0snn0r8k730p.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 630,
                                    "width": 947,
                                    "url": "https://cdn.impala.travel/properties/ckn8o6vb400lf0snn0hom7ytx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 852,
                                    "width": 1280,
                                    "url": "https://cdn.impala.travel/properties/ckn8oegqu00lu0snnb0os91m1.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8oeax900lt0snn705o9oou.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 651,
                                    "width": 978,
                                    "url": "https://cdn.impala.travel/properties/ckn8oe6y100ls0snn2yn485fh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 588,
                                    "width": 883,
                                    "url": "https://cdn.impala.travel/properties/ckn8oe1ca00lr0snn6all7xw8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 664,
                                    "width": 997,
                                    "url": "https://cdn.impala.travel/properties/ckn8odx2300lq0snn07bs1hpz.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 632,
                                    "width": 950,
                                    "url": "https://cdn.impala.travel/properties/ckn8odrv200lp0snn8xbaeoet.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 661,
                                    "width": 993,
                                    "url": "https://cdn.impala.travel/properties/ckn8odmk300ln0snn29jqa5nx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 654,
                                    "width": 983,
                                    "url": "https://cdn.impala.travel/properties/ckn8odinb00lm0snndb8tfst5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 636,
                                    "width": 956,
                                    "url": "https://cdn.impala.travel/properties/ckn8o78jv00li0snn54b2cmz0.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "42a38c00-8452-4e41-b0ca-6b9ce6d7bb57",
                            "name": "Business Apartament",
                            "description": "Spacious apartment located in Paseo de Gracia, on the main city center of Barcelona and near Plaza Cataluña and Las Ramblas. The apartment has capacity for 6 people in 3 double suites with a private full bathroom each one, a dining area, a lounge area and a fully equipped kitchen with fridge, oven, microwave, coffee and tea makers and dishwasher. Other services provided are satellite TV, washing machine, dryer, iron, linens and towels.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 601,
                                    "width": 903,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohurs00m10snn3zlo8yri.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 650,
                                    "width": 977,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohzje00m20snna4q3f45p.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 627,
                                    "width": 943,
                                    "url": "https://cdn.impala.travel/properties/ckn8oi40v00m30snnbc0cdwmo.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 661,
                                    "width": 993,
                                    "url": "https://cdn.impala.travel/properties/ckn8oi97c00m40snnecegdp2l.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 589,
                                    "width": 886,
                                    "url": "https://cdn.impala.travel/properties/ckn8oiea900m50snngvuw3by4.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 596,
                                    "width": 896,
                                    "url": "https://cdn.impala.travel/properties/ckn8oiimb00m60snn3tjaa3xx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 681,
                                    "width": 1024,
                                    "url": "https://cdn.impala.travel/properties/ckn8oin1n00m70snndn9g17am.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 645,
                                    "width": 969,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohdkh00lx0snn08tf46xx.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 614,
                                    "width": 923,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohhim00ly0snn06w75814.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 619,
                                    "width": 930,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohlyt00lz0snn11352yzb.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 650,
                                    "width": 976,
                                    "url": "https://cdn.impala.travel/properties/ckn8ohq0k00m00snnc71e3d06.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 645,
                                    "width": 969,
                                    "url": "https://cdn.impala.travel/properties/ckn8oh4av00lv0snn8f9q1q46.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 615,
                                    "width": 924,
                                    "url": "https://cdn.impala.travel/properties/ckn8oh94e00lw0snnewb07zeq.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "0057f85d-997d-4ea8-bed1-3d4bf7f6e4d4",
                            "name": "Penthouse 3 Bedrooms",
                            "description": "Penthouse apartment with 3 double bedrooms. The apartment also has 2 full bathrooms with bath/shower, living-dining room and a full equipped kitchen with fridge, oven, microwave, coffee and tea maker and washing machine.\nThe apartment has a large terrace with amazing city views and overlooking to Sagrada Familia.",
                            "maxOccupancy": 6,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p7le100ne0snn46wa64xy.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2287,
                                    "width": 3436,
                                    "url": "https://cdn.impala.travel/properties/ckn8pau8p00nv0snngoa03cp8.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2488,
                                    "width": 3738,
                                    "url": "https://cdn.impala.travel/properties/ckn8pahm400nu0snnf6kb5odf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pa6z700nt0snn2zygfyee.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p9wnl00ns0snn7pv16fv2.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2418,
                                    "width": 3634,
                                    "url": "https://cdn.impala.travel/properties/ckn8p9kjg00nq0snney9zed2c.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p98t100no0snnfrr74aa5.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p8xec00nm0snn3myrhyrc.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p8kst00nl0snn3ma06tqr.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p89kg00ni0snn8ov08t88.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p7y0600nh0snn9vrl3jls.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8p79kc00nc0snn377g1uux.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pct9y00o70snnb5iebc6z.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2542,
                                    "width": 3820,
                                    "url": "https://cdn.impala.travel/properties/ckn8pchgs00o50snndmuyhq8t.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pc32a00o40snn3kxqa0i6.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2467,
                                    "width": 3707,
                                    "url": "https://cdn.impala.travel/properties/ckn8pbs5x00o20snn91xi41yh.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2411,
                                    "width": 3624,
                                    "url": "https://cdn.impala.travel/properties/ckn8pbg5v00nz0snncaof0jjf.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pb52s00ny0snnf8lx0bt8.jpg"
                                }
                            ]
                        },
                        {
                            "roomTypeId": "5445ffd8-cd9f-48c1-8bdf-7783b76bd59a",
                            "name": "Penthouse 4 Bedrooms",
                            "description": "Penthouse apartment with 4 double bedrooms. The apartment also has 2 full bathrooms with bath/shower and a half bathroom, living-dining room and a full equipped kitchen with fridge, oven, microwave, coffee and tea maker and washing machine.\nThe apartment has a large terrace with amazing city views and overlooking to Sagrada Familia.",
                            "maxOccupancy": 8,
                            "rates": [],
                            "amenities": [
                                {
                                    "code": 85,
                                    "formatted": "Private bathroom"
                                },
                                {
                                    "code": 77,
                                    "formatted": "Oven"
                                },
                                {
                                    "code": 68,
                                    "formatted": "Microwave"
                                },
                                {
                                    "code": 61,
                                    "formatted": "Kitchenette"
                                },
                                {
                                    "code": 59,
                                    "formatted": "Kitchen"
                                },
                                {
                                    "code": 50,
                                    "formatted": "Hairdryer"
                                },
                                {
                                    "code": 32,
                                    "formatted": "Dishwasher"
                                },
                                {
                                    "code": 19,
                                    "formatted": "Coffee/Tea maker"
                                },
                                {
                                    "code": 18,
                                    "formatted": "Cable television"
                                },
                                {
                                    "code": 2,
                                    "formatted": "Air conditioning"
                                },
                                {
                                    "code": 271,
                                    "formatted": "Separate toilet area"
                                },
                                {
                                    "code": 270,
                                    "formatted": "Seating area with sofa/chair"
                                },
                                {
                                    "code": 256,
                                    "formatted": "Dining room seats"
                                },
                                {
                                    "code": 251,
                                    "formatted": "TV"
                                },
                                {
                                    "code": 223,
                                    "formatted": "Mountain view"
                                },
                                {
                                    "code": 210,
                                    "formatted": "Satellite television"
                                },
                                {
                                    "code": 167,
                                    "formatted": "Toaster"
                                },
                                {
                                    "code": 163,
                                    "formatted": "DVD player"
                                },
                                {
                                    "code": 123,
                                    "formatted": "Wireless internet connection"
                                },
                                {
                                    "code": 88,
                                    "formatted": "Refrigerator"
                                },
                                {
                                    "code": 15,
                                    "formatted": "Bath or Shower"
                                },
                                {
                                    "code": 16,
                                    "formatted": "Bidet"
                                }
                            ],
                            "images": [
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pibr000oq0snn44yzc2ld.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2315,
                                    "width": 3480,
                                    "url": "https://cdn.impala.travel/properties/ckn8pofaa00oz0snn97zmbqof.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8poo3c00p00snndgc4ec54.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2365,
                                    "width": 3553,
                                    "url": "https://cdn.impala.travel/properties/ckn8ppzmg00p50snncvzrdutw.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2507,
                                    "width": 3768,
                                    "url": "https://cdn.impala.travel/properties/ckn8pi2qb00oo0snn8cpa9sif.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2118,
                                    "width": 3183,
                                    "url": "https://cdn.impala.travel/properties/ckn8peabk00oc0snn26uvhhpn.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2169,
                                    "width": 3260,
                                    "url": "https://cdn.impala.travel/properties/ckn8pemkp00oe0snn453ifums.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2473,
                                    "width": 3715,
                                    "url": "https://cdn.impala.travel/properties/ckn8pimcb00os0snnfhizegjs.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8phsrk00om0snn93bifu49.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8poyu400p10snn6fmyf64b.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pp83s00p20snnhlss044h.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2554,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ppr5w00p40snn09j9dv7w.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8pphty00p30snn4u5jhxon.jpg"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8phkia00ol0snngmu6ew4k.webp"
                                },
                                {
                                    "altText": null,
                                    "height": 2555,
                                    "width": 3840,
                                    "url": "https://cdn.impala.travel/properties/ckn8ph9mp00oi0snn8qqrcrib.webp"
                                }
                            ]
                        }
                    ]
                }
            ],
            "pagination": {
                "count": 25,
                "total": 1708,
                "next": "https://sandbox.impala.travel/v1/hotels?size=25&offset=25",
                "prev": null
            }
        }
    """.trimIndent()
}