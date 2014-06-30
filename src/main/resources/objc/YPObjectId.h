#import <Foundation/Foundation.h>
#import "YPObject.h"

@interface YPObjectId : YPObject

@property(nonatomic) NSString* _id;
@property(nonatomic) BOOL isLoaded;

- (id) _id: (NSString*) _id;
- (id) initWithValues:(NSDictionary*)dict;
//- (id) initWithObjectId: (NSString*)dict;
- (NSDictionary*) asDictionary;

- (NSString*)get_idValue;

@end
